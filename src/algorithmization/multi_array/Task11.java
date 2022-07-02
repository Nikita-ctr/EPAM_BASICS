package algorithmization.multi_array;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 * */
public class Task11 {
    public static void main(String[] args) {

        int[][] arr;
        arr = new int[][] { { 9, 8, 9, 4 }, { 9, 2, 3, 4 }, { 8, 0, 5, 5 }, { 5, 2, 2, 3 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) {
                    if (arr[0][j] > arr[arr[i].length - 1][j]) {
                        System.out.print(arr[i][j] + " ");
                    }

                }
            }
            System.out.print("\n");
        }
    }
}

