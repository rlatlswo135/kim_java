package ch02.BooleanExample;

public class BooleanExample {
    public static void main(String[] args){
        boolean isStop = false;

        if(isStop){
            System.out.println("프로그램을 중지합니다");
        }else{
            System.out.println("정지하지 않습니다");
        }

        int num = 10;
        boolean isEqual = num == 20;
        boolean isNotEqual = num != 20;

        System.out.println("result1 ->" + isEqual);
        System.out.println("result2 ->" + isNotEqual);
    }
}
