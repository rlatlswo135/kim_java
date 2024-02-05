package oop_basic2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseTest {
    @DisplayName("과목(코스)를 생성한다.")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+")).doesNotThrowAnyException();
    }

    @DisplayName("코스들을 받아서 점수를 계산해본다.")
    @Test
    void gradeCalculateTest() {
        List<Course> courses = List.of(new Course("운영체제", 3, "A+"), new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double result = gradeCalculator.calculate();

        assertThat(result).isEqualTo(4.5);
    }
}
