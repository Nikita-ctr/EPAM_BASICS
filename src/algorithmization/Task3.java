package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    static Scanner scn=new Scanner(System.in);
    static Random random=new Random();
    public static void main(String[] args) {
        int n=scn.nextInt();

        int negative=0;
        int positive=0;
        int zero=0;

        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(21)-10;
            System.out.println(arr[i]);

            if (arr[i] < 0){
                negative++;
            } else if (arr[i] == 0) {
                zero++;
            } else
                positive++;

        }
        System.out.println("Колличество элементов\nПоложительных: "+positive+"\nОтрицательных: "+negative+"\nНулевых: "+zero);
    }
}
