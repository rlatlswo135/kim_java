package ch06.AbstractExample;

abstract class Abstract {
    String name;
    int age;

    // 자식 클래스의 생성자 실행시 추상클래스의 생성자도 실행되기때문에 있어야
    Abstract(String name, int age){
        this.name = name;
        this.age = age;
    }
    
     void run(){
        System.out.println("달립니다.");
    };

    // 추상 메서드 -> 실행문이 없으니 상속받은 쪽이 실행문을 적어줘야함
    abstract void stop();
}

public class AbstractExample extends Abstract {
    AbstractExample(String name,int age){
        super(name, age);
    }

    // 요기
    void stop(){
        System.out.println("달립니다.");
    }
}
