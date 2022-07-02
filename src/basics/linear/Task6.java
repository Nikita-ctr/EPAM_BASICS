package basics.linear;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 *
 * (рисунок с изображением закрашенной области)
 * https://raw.githubusercontent.com/Java0Tutor/1_Basics_of_software_code_development/master/Practice%20(tasks).pdf
 * */
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
