package basics;

import java.util.Scanner;

public class Task10 {
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размеры A и B прямоугольного отверстия.");
        double sizeA=scn.nextDouble();
        double sizeB=scn.nextDouble();

        System.out.println("Введите размеры x, y, z кирпича.");
        double sizeX=scn.nextDouble();
        double sizeY=scn.nextDouble();
        double sizeZ=scn.nextDouble();

        boolean isPass = false;
        if ((sizeX < sizeA && sizeY < sizeB) || (sizeX < sizeB && sizeY < sizeA))
            isPass = true;
        else if ((sizeY < sizeA && sizeZ < sizeB) || (sizeY < sizeB && sizeZ < sizeA))
            isPass = true;
        else if ((sizeX < sizeA && sizeZ < sizeB) || (sizeX < sizeB && sizeZ < sizeA))
            isPass = true;
        System.out.println(isPass);

    }
}
