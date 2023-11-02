package bin.ch10.EqualsTest;

public class EqualsTest {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "abcd";
        String str3 = str;


        System.out.println(str.equals(str2)); // 원래 객체번지수를 동등비교지만 코드를 보면 String 인경우 데이터 자체를 비교한다
        System.out.println(str.hashCode());
        System.out.println(str3.hashCode());

        System.out.println(str.equals(str3));
     
        // equals = 객체 번지수 비교
        // object.hashCode(); // 객체를 식별하는 정수
    }

}
