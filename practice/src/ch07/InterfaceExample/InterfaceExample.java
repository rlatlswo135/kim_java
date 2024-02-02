package ch07.InterfaceExample;

interface Machine {
    void clean();
}
interface RemoteControl {
    int BATTERY = 100;

    void turnOn();

    default void setMute(Boolean mute){
        if(mute){
            System.out.println("장치를 음소거합니다.");
        }else{
            System.out.println("장치 음소거를 해제합니다.");
        }
    };

    static void turnOff(){
        System.out.println("장치 전원을 끕니다.");
    };
}

// 다중 interface 구현
class Television implements RemoteControl,Machine {
    @Override

    public void clean(){
        System.out.println("기계 청소를 합니다.");
    }

    public void turnOn(){
        System.out.println("tv를 켭니다." + "남은 배터리 : " + RemoteControl.BATTERY);
    }

    @Override
    public void setMute(Boolean mute){ // 기본(default)메서드 재정의 -> 반드시 public을 붙이고 default를 떼주어야한다
        System.out.println("장치 음소거를 해제합니다.");
    }
}

class Audio implements RemoteControl{
    @Override
    public void turnOn(){
        // NOTICE : 정적 변수에 접근할때는 정적방식으로 접근해야한다 = 클래스에서 참조하는 방식 (this,인스턴스가 아닌)
        System.out.println("오디오를 켭니다." + "남은 배터리 : " + RemoteControl.BATTERY);
    }
}

public class InterfaceExample  {
    public static void main(String[] args){
        RemoteControl rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();

        RemoteControl.turnOff(); // 정적(static) 메서드

    }
}
