package algorithmization.multi_array;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 * */
public class Task20 {

    public static void main(String[] args) {
        int[][] arr;

        arr = new int[][] { { 2, -3, 10, 39, -5 }, { 2, -1, 35, -2, 8 }, { -3, 5, -31, 9, -8 }, { 5, -1, -2, 7, -9 },
                { -22, -6, -9, 2, 8 } };

        System.out.print("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.print(arr[i][i] + " ");
            }
        }

    }
}
