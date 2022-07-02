package algorithmization.sorting;

import java.util.Arrays;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)-м  элементами  первого,
 * при этом не используя дополнительный массив.
 * */
public class Task27 {

    public static int[] pasteToArray(int[] toArr, int[] arr, int k) {
        int[] finalArr;

        finalArr = new int[toArr.length + arr.length];

        for (int i = 0; i < finalArr.length; i++) {
            if (i <= k) {
                finalArr[i] = toArr[i];
            } else if (i < k + arr.length + 1) {
                finalArr[i] = arr[i - k - 1];
            } else if (i > k + arr.length - 1) {
                finalArr[i] = toArr[i - arr.length];
            }
        }
        return finalArr;

    }
    public static void main(String[] args) {


        int[] arr1 = new int[]{22, 31, 23, 45, 34, 2, 3, 60, 90, 100};
        int[] arr2 = new int[]{50, 12, 20, 76, 15, 85, 105};
        int k = 5;

        System.out.println(Arrays.toString(pasteToArray(arr1, arr2, k)));
    }
}
