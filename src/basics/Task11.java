package basics;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task11 {
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        double x=scn.nextDouble();
        double f=(x <= 3) ? x * x - 3 * x + 9 : 1 / (pow(x, 3) + 6);
        System.out.println("Результат выполнения функции: " + f);
    }
}
