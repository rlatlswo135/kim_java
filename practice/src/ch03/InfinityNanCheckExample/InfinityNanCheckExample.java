package ch03.InfinityNanCheckExample;

public class InfinityNanCheckExample {
    public static void main(String[] args){
        int x = 5;
        double y = 0.0;
        double z = x/y;

        System.out.println(z+2);

        if(Double.isNaN(z) || Double.isInfinite(z)){
            System.out.println("값 산출 불가" + z);
        }else{
            System.out.println(z+2);
        }
    }
}
