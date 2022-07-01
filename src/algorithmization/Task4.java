package algorithmization;

import java.util.Random;

public class Task4 {
    static Random random=new Random();

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
         for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
         }
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=random.nextInt(10);
        }
        int max=getMax(arr);
        int min=getMin(arr);
        System.out.println("Максимальный элемент: "+ max);
        System.out.println("Минимальный элемент: "+ min);
    }
}
