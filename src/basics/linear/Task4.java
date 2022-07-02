package basics.linear;

import java.util.Scanner;

/*
 * 4. Дано действительное число R вида nnn.ddd
 * (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 * */
public class Task4 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        double r= scn.nextDouble();

        int intPart = (int) r;
        int fractionalPart = (int) (Math.round((r - intPart) * 1000));
        double newNumber = fractionalPart + (double) intPart / 1000;

        System.out.printf("Первоначальное число %6.3f%n\nПреобразованное число %6.3f%n", r, newNumber);
    }
}
