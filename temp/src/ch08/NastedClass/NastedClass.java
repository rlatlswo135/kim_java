package ch08.NastedClass;

// NOTICE : 중첩클래스 사용이유 = 상호 의존성이 적은 클래스들은 독립선언보단 내부에 생성해주는게 유지보수에 좋다.
public class NastedClass {
    // 일반 클래스와 같이 필드,생성자,메서드 다 올수있지만. 정적(static)필드,메서드는 Java17 부터 선언가능.
    public class A {}  // 패키지 외부에서도 해당 멤버 클래스 사용가능
    class B {} // 같은 패키지에서만
    private class C {} // 해당 인스턴스 에서만

    void getLocalClass(){
        int arg = 1;
        class D{
            void method(){
                arg=3; // BUG : 로컬 클래스가 로컬 변수 사용할경우 로컬변수는 final 특성을 가져 수정이 불가하게 한다
            }
            this // 중첩객체의 this -> 바깥클래스의 this를 얻으려면 NastedClass.this
        }
        // 일반 클래스와 같이 필드,생성자,메서드 다 올수있지만. 정적(static)필드,메서드는 Java17 부터 선언가능. (위와동일)

        D localClass = new D(); 
    }

    void method(){
        C privateClass = new C();
    }
}
