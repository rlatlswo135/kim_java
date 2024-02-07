package oop_basic2;

import java.util.List;

public class GradeCalculator {
    /**
     * 모든 코스의 point값, 모든 코스의 gradePoint가 필요하니 목적에 맞게 courses라는 일급 컬렉션으로 만들고
     * 그 안에 책임들을 전부 넣는다 (= 작업위임)
     */
    private final Courses courses; // 일급 컬렉션 (다름 데이터유형과 동등한 위치에 있는 컬렉션)

    public GradeCalculator(List<Course> courses) {
        // this.courses = courses;
        this.courses = new Courses(courses);
    }

    public String getGreeting() {
        return "Hello World!";
    }

    /*
     * 평균학점 = (학점수 * 교과목 평점)의 합 / 수강신청 총 학점 수 NBSP
     */

    double calculate() {
        double multiplyPointAndGrade = courses.multiplyPointAndGrade();
        int totalCoursePoint = courses.totalPoint();

        return multiplyPointAndGrade / totalCoursePoint;
    }
}

// NOTICE :
// 외부 클래스에서 특정 클래스에 대한 getter를 이용해서 로직 구현시 필드를 가지고있는 클래스에서
// 로직을 합쳐서 한번더 책임을 분리할 수 있는지 확인