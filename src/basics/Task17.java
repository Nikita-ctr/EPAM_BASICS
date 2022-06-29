package basics;

public class Task17 {
    public static void main(String[] args) {
        for (char ch = 33; ch <= 126; ch++)
            System.out.printf("Код символа = %d | Символ: %c\n", (int) ch, ch);
    }
}
