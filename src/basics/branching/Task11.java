package basics.branching;

import java.util.Scanner;

import static java.lang.Math.pow;

/*
 * 5. Вычислить значение функции: x^2-3x+9, если x <= 3; 1/((x^3)+6), если x > 3.
 * */
public class Task11 {
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        double x=scn.nextDouble();
        double f=(x <= 3) ? x * x - 3 * x + 9 : 1 / (pow(x, 3) + 6);
        System.out.println("Результат выполнения функции: " + f);
    }
}
