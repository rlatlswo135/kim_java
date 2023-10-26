package ch07.InterfaceExample;

interface RemoteControl {
    public void turnOn();
}

class Television implements RemoteControl {
    @Override
    public void turnOn(){
        System.out.println("tv를 켭니다.");
    }
}

class Audio implements RemoteControl{
    @Override
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }
}

public class InterfaceExample  {
    public static void main(String[] args){
        RemoteControl rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
