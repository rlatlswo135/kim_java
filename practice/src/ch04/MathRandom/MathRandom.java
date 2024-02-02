package ch04.MathRandom;

public class MathRandom {
    public static void main(String[] args){
        int random = (int)(Math.random()*6)+1;

        System.out.println(random + "번이 나왔습니다.");
    }
}
