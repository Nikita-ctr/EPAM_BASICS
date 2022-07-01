package algorithmization;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 4, 7, 12, 36, 3, 3, 82};
        int[] newArr = new int[]{};
        int min = arr[0];
        int count = 0;

        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }

        for (int value : arr) {
            if (value != min) {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[count] = value;
                count++;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}

