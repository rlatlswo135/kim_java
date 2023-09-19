package ch05.StringMethodExample;

public class StringMethodExample {
    public static void main(String[] args){
        String target = "자바 프로그래밍";

        System.out.println(target.charAt(2));
        System.out.println(target.length());

        String newTarget = target.replace("자바", "JAVA");
        System.out.println(newTarget);
        System.out.println(newTarget.substring(0,4));
        System.out.println(newTarget.indexOf("프로그래밍"));
        System.out.println(newTarget.contains("프로그래밍"));
        System.out.println(newTarget.split(" ")[0]);
        System.out.println(newTarget.split(" ")[1]);
    }
}
