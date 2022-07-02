package algorithmization.arrays;

import java.util.Arrays;

/*
 * 10. Дан целочисленный массив с количеством элементов n.
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 * */
public class Task10 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 7, 1, 10, 5, 23, 9, 0};

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

