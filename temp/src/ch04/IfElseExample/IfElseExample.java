package ch04.IfElseExample;

public class IfElseExample {
    public static void main(String[] args){
        int score = 75;

        if(score>=90){
            System.out.println("점수가 100~90 입니다.");
        }else if(score >= 80){
            System.out.println("점수가 80 ~ 90 입니다.");
        }else if(score >= 70){
            System.out.println("점수가 70 ~ 79 입니다.");
        }else{
            System.out.println("점수가 70 미만입니다.");
        }
    }
}
