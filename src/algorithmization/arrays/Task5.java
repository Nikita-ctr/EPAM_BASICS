package algorithmization.arrays;

/*
 * 5. Даны целые числа а1 ,а2 ,..., а_n .
 * Вывести на печать только те числа, для которых а_i > i.
 * */

public class Task5 {

    public static void main(String[] args) {
        int[] arr=new int[]{2,3,7,1,10,5,23,9,0};

        for (int i = 0; i <arr.length; i++) {

            if (arr[i] > i) {

                System.out.println(arr[i]);
            }
        }
    }
}
