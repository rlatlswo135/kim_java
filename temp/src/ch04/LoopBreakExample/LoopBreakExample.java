package ch04.LoopBreakExample;

public class LoopBreakExample {
    public static void main(String[] args) throws Exception{
        Outter : for(char upper = 'A',lower='a'; upper <= 'Z' || lower <= 'z'; upper++,lower++){
            System.out.println("upper : " + upper + " lower : "+lower);
            if(lower == 'g') break Outter;
        }

        int count = 0;

        // continue문은 만나면 다음 실행문 실행은 그만하고 조건식으로 바로 이동
        while(count <= 3){
            count ++;
            if(count < 2) continue;

            System.out.println("마무리 count : " + count);
        }
    }
}
