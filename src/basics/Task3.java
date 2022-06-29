package basics;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        double x=scn.nextDouble();
        double y=scn.nextDouble();

        double res=(sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println(res);
    }
}
