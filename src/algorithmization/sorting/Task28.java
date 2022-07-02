package algorithmization.sorting;

/*
 * 2. Даны две последовательности a1 <= a2 <= .... <= a_n и b1 <= b2 <= ... <= b_m.
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 * */

import java.util.Arrays;

public class Task28 {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int mid = 0;
                if (arr[j-1] > arr[j]) {
                    mid = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = mid;
                }
            }
        }
    }

    public static int[] mergeArrays(int[] toArr, int[] arr) {

        int[] finalArr;

        finalArr = new int[toArr.length + arr.length];

        for (int i = 0; i < finalArr.length; i++) {
            if (i < toArr.length) {
                finalArr[i] = toArr[i];
            } else if (i >= toArr.length) {
                finalArr[i] = arr[i - toArr.length];
            }
            if (i == finalArr.length - 1) {
                bubbleSort(finalArr);
            }
        }
        return finalArr;

    }

    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;

        arr1 = new int[] { 10, 12, 14, 16, 18, 20 };
        arr2 = new int[] { 11, 13, 15, 17, 19 };

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
}
