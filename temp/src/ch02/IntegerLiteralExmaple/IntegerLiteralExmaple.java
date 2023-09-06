package ch02.IntegerLiteralExmaple;

public class IntegerLiteralExmaple {
    public static void main(String[] args){
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        byte var5 = 128; // 컴파일 에러 - byte 최대 허용값 (127[2^5] 초과)

        System.out.println("var1 :" + var1);
        System.out.println("var2 :" + var2);
        System.out.println("var3 :" + var3);
        System.out.println("var4 :" + var4);
    }
}
