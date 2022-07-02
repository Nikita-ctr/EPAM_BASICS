package basics.linear;

import java.util.Scanner;

//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class Task1 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        int z=((a-3)*b/2)+c;
        System.out.println(z);
    }
}
