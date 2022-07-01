package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    static Scanner scn=new Scanner(System.in);
    static Random random=new Random();
    public static void main(String[] args) {

        int z=scn.nextInt();
        int counter=0;

        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            if (arr[i] > z){
                arr[i] = z;
                counter++;
            }
        }
        System.out.println("Количество замен: "+counter);
    }
}
