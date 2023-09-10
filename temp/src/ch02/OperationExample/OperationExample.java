package ch02.OperationExample;

public class OperationExample {
    public static void main(String[] args){
        byte result = 10 + 20; //  컴파일 단계에서 연산 (변수가 피연산자 X)

        byte v1 = 10;
        byte v2 = 20;

        int result2 = v1 + v2; // 변수가 피연산자일때 byte,short타입은 int로 자동 타입변환 -> int타입이 결과로 와야함

        byte v3 = 10;
        int int1 = 100;
        long long1 = 1000L;

        long result3 = v3 + int1 + long1; // 가장 큰타입인 long으로 먹어줘야함

        int int2 = 10;
        double double1 = 100;

        int result4 = int2 + (int)double1; // 큰 타입인 double이 아닌 int로 먹고싶으면 타입을 쪼개서 -> 캐스탱 연산자()사용
    }
}
