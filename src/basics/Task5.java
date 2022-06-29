package basics;

import java.util.Scanner;

public class Task5 {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        int time=scn.nextInt();

        int ss = time % 60;
        int mm = (time / 60) % 60;
        int hh = time / 3600;

        System.out.printf("%dч %dмин %dс\n", hh, mm, ss);
    }
}
