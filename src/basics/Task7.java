package basics;

import java.util.Scanner;

public class Task7  {
    static Scanner scn=new Scanner(System.in);

    public static boolean isATriangle(double angle1, double angle2){

        if (angle1 > 0 && angle2 > 0)
        {
            double angle3 = 180 - angle1 - angle2;
            return angle3 > 0 && angle3 < 180;
        }
        return false;
    }

    public static boolean isRectangularTriangle(double angle1, double angle2, double angle3){

        return angle1 == 90 || angle2 == 90 || angle3 == 90;
    }

    public static void main(String[] args) {
        double angle1 = scn.nextDouble();
        double angle2 = scn.nextDouble();
        if (isATriangle(angle1, angle2))

        {
            System.out.println("Треугольник существует.");
            if (isRectangularTriangle(angle1, angle2, 180 - angle1 - angle2))
                System.out.println("Он является прямоугольным");
        }
        else
            System.out.println("Треугольник не существует.");
    }
}
