package oop_basic2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * # 요구사항
 * 평균학점 = (학점수 * 교과목 평점)의 합 / 수강신청 총 학점 수 NBSP
 * 일급 컬렉션 사용
 */

/**
 * 객체 설계시 생각해볼만한 것들.
 * 1. 도메인을 구성하는 객체에는 어떤 것들이 있을지 고민 (이수한 과목, 학점 계산기 등..)
 * 2. 객체들 간의 관계를 고민
 * 3. 동적인 객체를 정적인 타입으로 추상화 해서 도메인 모델링하기
 * - 동적인객체(자료구조, 중국어회화, 운영체제) -> 정적인객체(과목[코스]) == 즉 추상화를 하는것을 말하는듯.
 * 4. 협력을 설계
 * - 이수과목 전달 -> 평균학점 계산 요청 ... to 학점 계산기 [협력 설계]
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현하기
 * 객체지향 세계에서는 모든 객체가 능동적인 존재.
 */

class GradeCalculatorTest {
    @Test
    void appHasAGreeting() {
        GradeCalculator classUnderTest = new GradeCalculator();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
