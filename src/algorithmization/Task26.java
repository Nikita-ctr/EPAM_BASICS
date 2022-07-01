package algorithmization;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task26 {
    static Random rand = new Random();
    public static void main(String[] args) {
        int[][] arr;
        int n;

        n = getNum(10);
        arr = new int[n][n];

        if (n % 2 != 0) {
            oddMagicSquare(n, arr);
        } else if (n % 4 != 0) {
            System.out.println("Упс... Случайно сгенерированная матрица не подходит"
                    + "\nдля создания магического квадрата!\nПрожалуйста, перезапустите программу.");
            System.exit(0);
        } else {
            evenMagicSquare(n, arr);
        }

        printMatrix(arr);

    }

    public static void oddMagicSquare(int n, int array[][]) {
        int i;
        int j;

        i = 0;
        j = n / 2;

        for (int k = 1; k <= n * n; k++) {
            array[i][j] = k;
            if (k % n == 0) {
                i++;
            } else {
                i--;
                j++;
                if (i < 0)
                    i = n - 1;
                if (j > n - 1)
                    j = 0;
            }
        }
    }

    public static void evenMagicSquare(int n, int array[][]) {
        int k1;
        int k2;

        k1 = 1;
        k2 = n * n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 4 == j % 4 || (i + j) % 4 == 3) {
                    array[i][j] = k2;
                } else {
                    array[i][j] = k1;
                }
                k2--;
                k1++;
            }
        }
    }

    public static int getNum(int max) {
        long newRandSeed;
        int num;

        newRandSeed = ThreadLocalRandom.current().nextLong();
        rand.setSeed(newRandSeed);
        num = 0;

        while (num < 3) {
            num = rand.nextInt(max);
        }

        return num;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("+-------");
        }
        System.out.print("+\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("   %d\t|", arr[i][j]);
            }
            System.out.print("\n");
            for (int d = 0; d < arr[0].length; d++) {
                System.out.print("+-------");
            }
            System.out.print("+\n");
        }
    }
}
