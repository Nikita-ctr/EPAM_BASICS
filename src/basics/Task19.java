package basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task19 {

    public static HashSet<Byte> commonDigitsOfNumbers(int a, int b){
        HashSet<Byte> commonDigits = new HashSet<>();
        int i = a;
        while (i != 0) {
            byte lastDigitA = (byte) (i % 10);
            int j = b;
            while (j != 0) {
                if (lastDigitA == j % 10) {
                    commonDigits.add(lastDigitA);
                    break;
                }
                j /= 10;
            }
            i /= 10;
        }
        return commonDigits;
    }

    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        int a=scn.nextInt();
        int b=scn.nextInt();

        HashSet<Byte> commonDigits = commonDigitsOfNumbers(a, b);
        System.out.print("Цифры, входящие в запись как первого так и второго числа: ");
        for (Byte commonDigit : commonDigits) {
            System.out.print(commonDigit);
        }
        System.out.println();
    }
    }

