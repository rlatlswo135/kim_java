package ch04.SwitchExample;

public class SwitchExample {
    public static void main(String[] args){
        int random = (int)(Math.random() * 10)+1;

        switch(random){
            case 5:
                System.out.println("당첨 되었습니다");
                break;
            default:
                System.out.println("당첨되지 않았습니다");
        }

        char grade = 'B';

        // Java12 이후에 생긴 switch 표현식(Expressions), break없이 중괄호로 가독성 향상 및 중괄호 안에 단일 실행문인 경우 중괄호 생략 가능
        switch(grade){
            case 'A','a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B','b' -> {
                System.out.println("일반 회원입니다.");
            }
            case 'C','c' -> {
                System.out.println("손님입니다.");
            }

            case 'D','d' -> System.out.println("악성 회원입니다.");
        }

        int score = switch(grade){
            case 'A','a' -> 90;
            case 'B','b' -> 80;
            case 'C','c' -> {
                int testScore = 60;
                yield testScore + 10;
            }
            case 'D','d' -> 60;
            default -> 50;
        };

        System.out.println("score는" + score + "점 입니다.");
    }
}
