package ch10.RecordExample;

// DTO를 만들때 흔히 Override하는 부분을 세팅해준다
// 자동으로 private final 필드 + Getter 메서드가 추가되며 동등비교를 위한 hashCode() + equals() 메서드가 재정의 및 toString() 메서드가 재정의된다.
record Person(String name, int age){}

public class RecordExample {
    public static void main(String[] args) throws Exception {
        Person person = new Person("1kimcj", 30);
        Person person2 = new Person("1kimcj", 30);
        
        System.out.println(person.age());
        System.out.println(person.name());
        System.out.println(person.toString());
        System.out.println(person.hashCode());
        
        System.out.println(person.equals(person2));
        
        int keyCode = 0;
        int speed = 0;

        while(true){
            if(keyCode != 13 && keyCode != 10){
                if(keyCode == 49){
                    speed++;
                }else if(keyCode == 50){
                    speed--;
                }else if(keyCode == 51){
                    break;
                }
            }
            keyCode = System.in.read();
        }
    }
}
