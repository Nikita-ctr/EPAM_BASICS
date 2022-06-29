package basics;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task8 {
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        double d = scn.nextDouble();

        double res=max(min(a,b),min(c,d));

        System.out.println("Результат выражения: " + res);

    }
}
