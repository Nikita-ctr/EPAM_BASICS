package algorithmization.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 * */
public class Task1 {
    static Scanner scn=new Scanner(System.in);
    static  Random random=new Random();
    public static void main(String[] args) {

        int n=scn.nextInt();
        int k=scn.nextInt();
        int sum=0;

        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=random.nextInt(10);

            if (arr[i] % k == 0){
                sum+=arr[i];
            }
        }
        System.out.println("Сумма элементов кратных: "+k+" равна: "+sum);
    }
}
