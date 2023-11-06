package ch11.AnnotationExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationName{
    String value() default "test";
    int props2() default 1;
}

@AnnotationName
public class AnnotationExample {
    @AnnotationName(value = "qwer", props2 = 3)
    int test = 3;
    public static void main(String[] args) {
        Class<AnnotationExample> clazz = AnnotationExample.class;

        AnnotationName annotation = clazz.getAnnotation(AnnotationName.class);
        System.out.println(annotation.value());
        System.out.println(annotation.props2());
    }
}
