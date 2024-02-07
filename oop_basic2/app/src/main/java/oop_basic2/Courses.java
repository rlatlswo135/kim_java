package oop_basic2;

import java.util.List;

public class Courses {
    List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyPointAndGrade() {
        // double average = 0;
        // for (Course course : courses) {
        // 만약 계산로직이 바뀐다면? course의 pint 및 gradeToNumber getter를 쓰는 부분이 전부 바뀌어야할것.
        // average += course.multiplyPointAndGrade();
        // // NOTICE : course 내부에서 point,gradeToNumber를 쓰는 계산 메서드를 만들어서 위임해주면 응집도가 올라갈
        // 것이다.
        // 해당 메서드내부에서만 수정해주면 되니까.
        // // NOTICE : getter를 이용한 로직은 항상 응집도를 생각해보자!
        // }

        // return average;
        return courses.stream().mapToDouble(Course::multiplyPointAndGrade).sum();
    }

    public int totalPoint() {
        // course -> course.getPoint() ... 메서드 참조식 Course::getPoint (Course 클래스에서
        // getPoint메서드 참조)
        int totalCoursePoint = courses.stream().mapToInt(Course::getPoint).sum();

        return totalCoursePoint;
    }
}
