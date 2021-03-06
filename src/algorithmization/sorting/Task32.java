package algorithmization.sorting;

/*
 * 6.Сортировка Шелла. Дан массив n действительных чисел.
 * Требуется  упорядочить  его  по  возрастанию. Делается это следующим образом:
 * сравниваются два соседних элемента a_i и a_i+1 . Если a_i <= a_i+1, то продвигаются на один элемент вперед.
 * Если a_i > a_i+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 * */

import java.util.Arrays;

public class Task32 {
    public static void main(String[] args) {
        double[] arr;

        arr = new double[]{3.2, -5.3, 12.1, 42.0, 0.25, -1, 23, -4, 8.9, 7.2};

        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void shellSort(double[] arr) {
        int i = 0;

        while (i < arr.length - 1) {
            double mid;

            if (arr[i] > arr[i + 1]) {
                mid = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = mid;

                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }
}
