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

    double calculate() {
        return 4.5;
    }
}
