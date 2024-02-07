package oop_basic2;

import java.util.List;

public class GradeCalculator {
    List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public String getGreeting() {
        return "Hello World!";
    }

    /*
     * 평균학점 = (학점수 * 교과목 평점)의 합 / 수강신청 총 학점 수 NBSP
     */

    double calculate() {
        double average = 0;
        for (Course course : courses) {
            average += course.getPoint() * course.getGradeToNumber();
        }

        // course -> course.getPoint() ... 메서드 참조식 Course::getPoint (Course 클래스에서
        // getPoint메서드 참조)
        int totalCoursePoint = courses.stream().mapToInt(Course::getPoint).sum();

        return average / totalCoursePoint;
        // return 4.5;
    }
}
