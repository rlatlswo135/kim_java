// 패키지 선언 : 소스파일이 src/ch01/HelloWorld에 있다는뜻 -> 컴파일시 바이트파일이 bin/ch01/HelloWorld 패키지에 생성된다
package ch01.HelloWorld;

// 클래스 선언 : 클래스명 = 소스파일 이름과 같아야함 (숫자시작 , 공백포함 X)
public class HelloWorld {
    // main 메서드 -> 바이트코드 파일 실행시 실행될 """실행문"""들이 위치 -> java프로그램 실행 진입점(entry point)
    // TSC : 실행문 : 변수선언 / 값저장 / 메서드 호출 등
    public static void main(String[] args){
        System.out.println("Hello,Java");
    }
}