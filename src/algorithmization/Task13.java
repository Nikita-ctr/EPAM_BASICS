package algorithmization;

public class Task13 {
    public static void main(String[] args) {
        int[][] arr;
        int k;
        int p;

        arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        k = 2;
        p = 3;

        System.out.print("Строка: ");
        printMultiArrLine(arr, k);

        System.out.print("Столбец: ");
        printMultiArrColumn(arr, p);

    }

    // нумерации с 0-го элемента
    public static void printMultiArrLine(int[][] arr, int line) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == line) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print("\n");
    }

    // нумерации с 0-го элемента
    public static void printMultiArrColumn(int[][] arr, int column) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == column) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print("\n");
    }
}

