package ch09.ExceptionExample;

public class ExceptionExample {
    public static void printLength(String string){
        try {
          int result = string.length();
          System.out.println("문자열 개수" + result);
        } catch (NullPointerException err) {
            System.out.println(err.getMessage()); // 예외의 이유만
            System.out.println(err.toString()); // 예외이유 + 종류까지
            err.printStackTrace(); // 예외이유 + 종류 + 추적내용 까지
        }finally{
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        printLength("This is Java");
        printLength(null); // String은 참조타입이니까 null가능이지
    }
}