package ch09.ExceptionExample2;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
          Class.forName("java.lang.String");
          System.out.println("java.lang.String 클래스 존재");
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        }

        System.out.println("------------");

        try {
          Class.forName("java.lang.String2");
          System.out.println("java.lang.String2 클래스 존재");
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        }
        // NOTICE : 예외핸들링을 여러개 해야할경우 catch문을 여러개 작성하면 되지만. 최상위의 예외 타입이 맨 나중에 검사되어야 한다. 아니면 | 로 예외의 타입을 익셉션으로 줄 수 있다.
    }
}
