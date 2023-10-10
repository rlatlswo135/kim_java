package ch06.StudentExample;

 class Student {
    String name;
    String school = "부천 북 고등학교";
    char gender;
    byte age;
    boolean isSpecial;

    Student(){}
    Student(String name){
        this.name = name;
    }
    Student(String name, char gender, byte age){
        this(name);
        this.gender = gender;
        this.age = age;
    }
    Student(String name,char gender, boolean isSpecial, byte age){
        this(name,gender,age);
        this.isSpecial = isSpecial;
    }

    void printInfo(byte age){
        System.out.println("나이는 " + age +"입니다");
    }
    void printInfo(String name){
        System.out.println("이름은 " + name + "입니다");
    }
}

public class StudentExample {
    public static void main(String[] args){
        // "김신재",'M',30,false
        Student st1 = new Student("김신재");
        Student st2 = new Student("조유민",'W',(byte)28);
        Student st3 = new Student("금돌이",'M',false,(byte)30);
        
        System.out.println("name = " + st1.name);
        System.out.println("age = " + st1.age);
        System.out.println("gender = " + st1.gender);
        System.out.println("isSpecial = " + st1.isSpecial);

        st1.printInfo((byte)30);
        st1.printInfo("윰니신재");
    }
}
