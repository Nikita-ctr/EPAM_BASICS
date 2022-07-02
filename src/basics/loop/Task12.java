package basics.loop;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое  целое  положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * */
public class Task12 {

    public static int sumOfNumbers(int limit)
    {
        int sum = 0;
        for (int i = 1; i < limit; i++)
            sum += i;
        return sum;
    }
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        int limit=scn.nextInt();
        int sum=sumOfNumbers(limit);
        System.out.printf("Сумма всех чисел от 0 до %d = %d\n", limit, sum);
    }
}
