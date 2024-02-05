package ch01.LamdaTest;

public class LamdaTest {
    public static void main(String[] args) {
        Runnable runnableLambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        };
        // Runnable runnableLambda = () -> System.out.println("Hello, World!");
        runnableLambda.run();
    }
}
