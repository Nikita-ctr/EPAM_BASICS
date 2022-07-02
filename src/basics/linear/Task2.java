package basics.linear;
import java.util.Scanner;

import static java.lang.Math.*;

/* 2. Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
 *
 * ( b + √(b^2 + 4 * a * c) / 2 * a) - a^3 * c + b^-2
 *
 * */
public class Task2 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        double res=b+sqrt((pow(b,2) + 4 * a * c)) / (2 * a) - pow(a,3) * c + pow(b,-2);
        System.out.println(res);
    }
}
