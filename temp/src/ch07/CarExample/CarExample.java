package ch07.CarExample;

interface Tire {
    void roll();
}

class HanKookTire implements Tire {
    public void roll(){
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}

class KumhoTire implements Tire{
    public void roll(){
        System.out.println("금호 타이어가 굴러갑니다.");
    }
}

class Car {
    Tire tire1 = new HanKookTire();
    Tire tire2 = new HanKookTire();

    public void run(){
        tire1.roll();
        tire2.roll();
    }
}

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.run(); // 메서드 실행

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run(); // 같은 메서드실행 = 다른결과 => 다형성
    }
}
