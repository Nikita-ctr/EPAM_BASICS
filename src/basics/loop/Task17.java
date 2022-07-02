package basics.loop;

/*
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 * */
public class Task17 {
    public static void main(String[] args) {
        for (char ch = 33; ch <= 126; ch++)
            System.out.printf("Код символа = %d | Символ: %c\n", (int) ch, ch);
    }
}
