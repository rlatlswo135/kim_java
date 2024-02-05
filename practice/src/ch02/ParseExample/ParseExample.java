package ch02.ParseExample;

public class ParseExample {
    public static void main(String[] args){
        String value1 = "1234";
        String value2 = "123.21345";

        int intValue = Integer.parseInt(value1);
        System.out.println(intValue);

        double doubleValue = Double.parseDouble(value2);
        System.out.println(doubleValue);

        int intValue2 = 12345;
        String string1 = String.valueOf(intValue2);
        System.out.println(string1);

        double doubleValue2 = 123.123412;
        String string2 = String.valueOf(doubleValue2);

        System.out.println(string2);
    }    
}
