package ch06.CarExample;

class Car {
    int speed = 0;
    final String name;
    static final String COMPANY;

    Car(String name){
        this.name = name;
    }
    static{
        COMPANY = "현대";
    }

    void run(){
        System.out.println(this.speed + "로 달립니다.");
    }

    static void getCompany(){
        System.out.println("회사는" + COMPANY + "입니다.");
    }

    static void simulate(){
        // 정적 메서드안에서 인스턴스 필드 및 메서드를 사용하려면
        Car myCar = new Car("우르스");
        myCar.speed = 100;
        myCar.run();
    }
}

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car("아반떼");
        Car.simulate();
        myCar.run();
    }
}
