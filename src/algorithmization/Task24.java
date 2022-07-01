package algorithmization;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task24 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[][] arr;
        int n;
        int m;

        n = getNum(10);
        m = getNum(10);
        while (m < n) {
            m = getNum(10);
        }
        arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= i)
                    arr[i][j] = 1;
            }
        }

        printMatrix(arr);

    }

    public static int getNum(int max) {
        long newRandSeed;
        int num;

        newRandSeed = ThreadLocalRandom.current().nextLong();
        rand.setSeed(newRandSeed);
        num = 0;

        while (num == 0) {
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
