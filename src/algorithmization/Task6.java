package algorithmization;

public class Task6 {

    public static boolean checkNum(int number){

        boolean check = true;

        for(int i =2; i<number; i++){
            if(number%i==0){
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,3,7,1,10,5,23,9,0};
        int sum=0;

        for (int i = 1; i <arr.length; i++) {
            if (checkNum(i)){
                sum+=arr[i];
            }
        }
        System.out.println("Сумма простых чисел: "+sum);
    }
}
