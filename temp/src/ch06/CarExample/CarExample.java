package ch06.CarExample;

class Car {
    int speed = 0;
    String name;
    static String company;

    static{
        company = "현대";
    }

    void run(){
        System.out.println(this.speed + "로 달립니다.");
    }

    static void getCompany(){
        System.out.println("회사는" + company + "입니다.");
    }

    static void simulate(){
        // 정적 메서드안에서 인스턴스 필드 및 메서드를 사용하려면
        Car myCar = new Car();
        myCar.speed = 100;
        myCar.run();
    }
}

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();
        Car.simulate();
        myCar.run();
    }
}
