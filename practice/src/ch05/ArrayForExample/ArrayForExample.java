package ch05.ArrayForExample;

public class ArrayForExample {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int sum = 0;

        for(int num : array){
            sum = sum + num;
        }

        System.out.println("sum = " + sum );
    }
}
