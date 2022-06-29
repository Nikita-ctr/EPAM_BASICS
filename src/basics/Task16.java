package basics;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task16 {

    public static double calculateRow(int n) {

        return 1 / pow(2, n) + 1 / pow(3, n);
    }

    public static double sumOfRow(double e){
        double sum = 0;
        if (e > 0) {
            int i = 1;
            double sumCurrent = calculateRow(i++);
            while (abs(sumCurrent) >= e) {
                sum += sumCurrent;
                sumCurrent = calculateRow(i++);
            }
        }
        return sum;
    }
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        int e=scn.nextInt();
        double sum=sumOfRow(e);
        System.out.printf("Сумма членов ряда, модуль которых больше заданного числа = %f\n", sum);
    }
}
