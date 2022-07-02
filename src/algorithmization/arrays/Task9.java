package algorithmization.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 * */
public class Task9 {
    static Scanner scn = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int n = scn.nextInt();
        int count = 0;
        int countMax = 0;
        int iMin = 0;
        int num = 0;

        int[] arr = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count >= countMax) {
                if (count > countMax) {
                    iMin = i;
                } else {
                    iMin = (arr[i] < arr[iMin]) ? i : iMin;
                }
                num = arr[iMin];
                countMax = count;
            }
            count = 0;
        }
        System.out.println("Искомое число - " + num + ", количество совпадений - " + countMax);
    }
}



