package basics.loop;

/*
 * 3. Найти сумму квадратов первых ста чисел.
 * */
public class Task14 {

    public static int sumOfSquares(int limit){
        int sumOfSquares=0;
        for (int i = 0; i < limit ; i++) {
            sumOfSquares+=i*i;
        }
        return sumOfSquares;
    }


    public static void main(String[] args) {
        int sum=sumOfSquares(100);
        System.out.printf("Cумма квадратов первых ста чисел = %d\n", sum);
    }
}
