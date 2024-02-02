package ch02.VariableUseExample;

public class VariableUseExample {
    public static void main(String[] args){
        int hour = 3;
        int minuate = 5;

        System.out.print(hour + "시간" + minuate + "분");

        int totalMinuate = (hour*60)+minuate;

        System.out.print("총 " + totalMinuate + "분");
    }
}
