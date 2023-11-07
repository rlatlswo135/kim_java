package ch11.ThreadStateExample;

class WorkThread extends Thread {
    public boolean work;

    WorkThread(boolean work){
        this.work = work;
    }

    void setWork(boolean work){
        this.work = work;
    }

    @Override
    public void run(){
        while(true){
            if(this.work){
                System.out.println("일중");
            }
            else{
                Thread.yield();
            }
        }
    }
}

class Sum {
    private long sum;

    long getSum(){
        return this.sum;
    }

    void setSum(){
        for(int i = 0; i<=100; i++){
            sum += i;
        }
    }
}

public class ThreadStateExample {
    public static void main(String[] args) {
        Sum sum = new Sum();
        WorkThread thread = new WorkThread(true);

        Thread sumThread = new Thread(new Runnable() {
            @Override
            public void run(){
                sum.setSum();
            }
        });

        thread.start();
        sumThread.start();
        try{
            sumThread.join(); // sumThread의 run메서드가 종료시까지 main쓰레드 실행대기상태로. Exception처리는 필수고
            thread.setWork(false);
        }catch(InterruptedException e){}

        System.out.println(sum.getSum());
    }
}
