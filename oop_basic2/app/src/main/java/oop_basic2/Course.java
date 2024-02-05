package oop_basic2;

public class Course {
    String name;
    int point;
    String grade;

    public Course(String name, int point, String grade) {
        this.name = name;
        this.point = point;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public String getGrade() {
        return grade;
    }
}
