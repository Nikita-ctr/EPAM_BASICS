package algorithmization;

public class Task7 {

    public static double getMax(double[] arr) {
        double max = arr[0] + arr[arr.length - 1];

        for (int i = 1; i < arr.length / 2; i++) {
            if ((arr[i] + arr[arr.length - i - 1]) > max) {
                max = arr[i] + arr[arr.length - i - 1];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        double[] arr=new double[]{2,3,7,1,10,5,23,9,0};

        System.out.println(getMax(arr));
    }
}
