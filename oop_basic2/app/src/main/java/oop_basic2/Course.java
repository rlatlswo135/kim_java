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

    public double getGradeToNumber() {
        double gradeToNumber = 0;
        switch (this.grade) {
            case "A+":
                gradeToNumber = 4.5;
                break;
            case "A":
                gradeToNumber = 4.0;
                break;
            case "B+":
                gradeToNumber = 3.5;
                break;
            case "B":
                gradeToNumber = 3.0;
                break;
            case "C+":
                gradeToNumber = 2.5;
                break;
            case "C":
                gradeToNumber = 2.0;
                break;
        }

        return gradeToNumber;
    }

    public double multiplyPointAndGrade() {
        return getPoint() * getGradeToNumber();
    }
}
