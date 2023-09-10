package ch03.OverAndUnderflowExample;

public class OverAndUnderflowExample {
    public static void main(String[] args){
        byte value = 127;
        ++value;
        System.out.println(value); // overflow

        byte value2 = -128;
        --value2;
        System.out.println(value2); // underflow
    }
}
