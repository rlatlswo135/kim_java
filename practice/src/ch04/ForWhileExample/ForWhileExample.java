package ch04.ForWhileExample;

import java.util.Scanner;

public class ForWhileExample {
    public static void main(String[] args){
        // 변수 초기화 -> 여러개 초기화 가능 int i=1,j=2;
        for(int i=1; i<=3; i++){
            System.out.println("반복 중입니다 -> 횟수 : "+i);

            // 반복문 실행 중지 및 조건문 switch 종료
            if(i == 2) break;
        }

        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        int speed = 0;

        // ()안에 조건식을 평가안 이후 실행문 실행 -> 다시 조건식 평가 -> 실행문 실행 반복..
        while(isRun){
            System.out.println("------------------------------------");
            System.out.println("현재 속도 : " + speed);
            System.out.println("속도 증가 : 1 감소 : 2 멈춤 : 3");
            System.out.println("------------------------------------");

            String choice = scanner.nextLine();

            switch(choice){
                case "1" -> speed++;
                case "2" -> speed--;
                default -> {
                    System.out.print("동작을 멈춥니다.");
                    isRun = false;
                }
            }
        }

        boolean isKeepGoing = false;

        // 실행문 실행 -> while()안 조건식 평가 -> true일시 다시 실행문 실행 -> 반복..
        do{
            System.out.println("do-while 반복중입니다. 반복하시겠습니까??");
            System.out.println("반복 : 1 , 취소 : 2");

            String choice = scanner.nextLine();

             isKeepGoing = switch(choice){
                case "1" -> true;
                default -> {
                    scanner.close(); // 위에서 scanner1.close()이후에 하니까 아예 디버깅이 종료가되는데 scanner가 닫혔을때 무슨일이 일어나는건지 확인이 필요해보인다
                    yield false;
                }
            };

        }while(isKeepGoing);
    }
}