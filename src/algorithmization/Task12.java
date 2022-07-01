package algorithmization;

public class Task12 {
    public static void main(String[] args) {

        int[][] arr;
        String str = new String("");
        arr = new int[][] { { 9, 8, 9, 4 }, { 9, 2, 3, 4 }, { 8, 0, 5, 5 }, { 5, 2, 2, 3 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    System.out.print(str + arr[i][j]);
                    str += "  ";
                }
            }
            System.out.print("\n");
        }

    }
}

