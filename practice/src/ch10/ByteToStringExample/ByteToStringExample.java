package ch10.ByteToStringExample;

import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) throws Exception {
        String data = "자바";
        final String CHARSET = "EUC-KR";

        byte[] arr1 = data.getBytes();
        System.out.println("arr1" + Arrays.toString(arr1));

        byte[] arr2 = data.getBytes(CHARSET);
        System.out.println("arr2" + Arrays.toString(arr2));

        String str1 = new String(arr1);
        System.out.println("str1" + str1);

        String str2 = new String(arr2,CHARSET);
        System.out.println("str2" + str2);
    }   
}
