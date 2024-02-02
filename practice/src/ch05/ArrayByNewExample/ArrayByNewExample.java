package ch05.ArrayByNewExample;

public class ArrayByNewExample {
    public static void main(String[] args){
        int[][] scores = new int[2][];
        
        scores[0] = new int[3];
        scores[1] = new int[2];

        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);

        System.out.println(scores[1][0]);
        System.out.println(scores[1][1]);
    }   
}
