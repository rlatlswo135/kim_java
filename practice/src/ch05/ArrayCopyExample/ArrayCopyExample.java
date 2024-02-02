package ch05.ArrayCopyExample;

public class ArrayCopyExample {
    public static void main(String[] args){
        String[] array = {"KIM","SHIN","JAE"};

        String[] copyArray = new String[5];

        System.arraycopy(array, 0, copyArray, 0, array.length);

        for(int i = 0; i < copyArray.length; i++){
            System.out.println("copyArray" + i + "번째" + copyArray[i]);
        }
    }
}
