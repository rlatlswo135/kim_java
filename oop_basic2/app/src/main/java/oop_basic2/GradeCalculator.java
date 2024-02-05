package oop_basic2;

public class GradeCalculator {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new GradeCalculator().getGreeting());
    }
}
