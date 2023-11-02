package bin.ch10.HashSetTest;

import java.util.HashSet;

class Student {
    private int grade;
    private String name;

    Student(int grade, String name){
        this.grade = grade;
        this.name = name;
    }

    int getGrade(){
        return grade;
    }

    String getName(){
        return name;
    }

    @Override
    public int hashCode(){
        return grade + name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student target){ 
            /*  
            # NOTICE : obj가 아닌 target을 사용하는 이유
            
            - target이 확실한 Student의 인스턴스라는 가독성측면
            - obj를 참조시 obj가 Studnet의 인스턴스가 아닐때 NullPointException 방지 -> if else로 처리가능하니까
            - target은 Student의 인스턴스로 확정되어있기때문에 유효범위 제한
            */
            if(grade == target.getGrade() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수" + hashSet.size());

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수" + hashSet.size());

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수" + hashSet.size());
        
    }
}
