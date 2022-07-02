package basics.loop;

import java.math.BigInteger;

/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 * */
public class Task15 {

    public static BigInteger productOfSquares(int limit) {
        BigInteger productOfSquares = BigInteger.valueOf(1);
        for (int i = 1; i <= limit; i++)
            productOfSquares = productOfSquares.multiply(BigInteger.valueOf(i * i));
        return productOfSquares;
    }

    public static void main(String[] args) {
        BigInteger product = productOfSquares(200);
        System.out.printf("Произведение квадратов первых двухсот чисел = %d\n", product);
    }
}
