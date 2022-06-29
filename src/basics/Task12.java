package basics;

import java.util.Scanner;

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
