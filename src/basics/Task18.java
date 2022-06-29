package basics;

import java.util.Scanner;

public class Task18 {

    public static void printAllDivisorsOfNaturalNumbersInRange(int m, int n)
    {
        for (int numb = Math.max(m, 1); numb < n; numb++) {
            System.out.printf("Число %d. Делители: ", numb);
            int rootNumb = (int) Math.sqrt(numb);
            for (int divider = 2; divider <= rootNumb; divider++) {
                if (numb % divider == 0) {
                    int secondDivider = numb / divider;
                    System.out.print(divider + ((secondDivider != divider) ? "\t" + secondDivider + "\t" : ""));
                }
            }
            System.out.println();
        }
    }
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        int m=scn.nextInt();
        int n=scn.nextInt();
        System.out.println("Все делители натуральных чисел в промежутке от m до n.");
        printAllDivisorsOfNaturalNumbersInRange(m, n);
    }
}
