package algorithmization;

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
