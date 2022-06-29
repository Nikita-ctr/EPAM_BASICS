package basics;

import java.util.Scanner;

public class Task6 {
    static Scanner scn=new Scanner(System.in);

    public static boolean isPointBelongs(double x, double y){
        return x >= -4 && x <= 4 && y >= -3 && y <= 0 || (x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }

    public static void main(String[] args) {
        double x=scn.nextDouble();
        double y=scn.nextDouble();

        System.out.println(isPointBelongs(x, y));
    }
}
