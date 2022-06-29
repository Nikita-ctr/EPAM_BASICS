package basics;

import java.util.Scanner;

public class Task13 {

    public static double values(double x) {
        return (x > 2) ? x : -x;
    }
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        double low=scn.nextDouble();
        double high=scn.nextDouble();
        double step=scn.nextDouble();

        if (step > 0) {
            for (double i = low; i <= high; i += step)
                System.out.printf("Аргумент функции x = %f | Значение функции f(x) = %f\n", i, values(i));

        }
    }
}
