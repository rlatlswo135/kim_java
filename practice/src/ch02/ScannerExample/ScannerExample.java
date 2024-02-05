package ch02.ScannerExample;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("x값 입력 :");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("y값 입력:");
        int y = Integer.parseInt(scanner.nextLine());

        int result = x + y;
        System.out.println("결과 : " + result + "\n");

        while(true){
            System.out.println("입력 문자열 : ");
            String inputData = scanner.nextLine();

            if(inputData.equals("q")){
                break;
            }

            System.out.println("입력 문자열 : " + inputData);
        }

        scanner.close();
        System.out.println("종료");
    }
}
