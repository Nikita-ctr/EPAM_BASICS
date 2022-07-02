package basics.branching;

import java.util.Scanner;

/*
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 * */
public class Task9 {
    public static boolean isPointsOnLine(double x1, double y1, double x2, double y2, double x3, double y3){
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return (y3 - y1) * deltaX - ((x3 - x1) * deltaY) == 0;
    }
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        double x1=scn.nextDouble();
        double y1=scn.nextDouble();
        double x2=scn.nextDouble();
        double y2=scn.nextDouble();
        double x3=scn.nextDouble();
        double y3=scn.nextDouble();

        if (isPointsOnLine(x1, y1, x2, y2, x3, y3))
            System.out.println("Все точки расположены на одной прямой");
        else
            System.out.println("Все точки расположены не на одной прямой");
    }
}
