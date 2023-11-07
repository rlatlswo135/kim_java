package ch11.MultiThreadExample;

import java.awt.Toolkit;

public class MultiThreadExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        
        Thread beepThread = new Thread(new Runnable() {
            @Override
            public void run(){ // thread가 실행시킬 로직을 run()메서드를 오버라이드해주고 start() 메서드로 실행시킨다
                for(int i = 0; i<5; i++){
                    System.out.println("띵");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        });
        beepThread.setName("Beep-Thread");
        System.out.println(beepThread.getName());
        
        beepThread.start();

        for(int i = 0; i<5; i++){
            toolkit.beep();
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
