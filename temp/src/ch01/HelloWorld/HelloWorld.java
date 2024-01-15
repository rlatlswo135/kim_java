// 패키지 선언 : 소스파일이 src/ch01/HelloWorld에 있다는뜻 -> 컴파일시 바이트파일이 bin/ch01/HelloWorld 패키지에 생성된다
package ch01.HelloWorld;

import java.util.ArrayList;

public class HelloWorld {
    private String subject;
    private String content;
    private String writer;

    public HelloWorld(String subject,String content, String writer){
        this.subject = subject;
        this.content = content;
        this.writer = writer;
        
    }

    public String getSubject(){return subject;}
    public void setSubject(String subject){this.subject = subject;}
    public String getContent(){return content;}
    public void setContent(String content){this.content = content;}
    public String getWriter(){return writer;}
    public void setWriter(String writer){this.writer = writer;}

}

class ListExample{
    public static void main(String[] args) {
        ArrayList<HelloWorld> list = new ArrayList<>();
        list.add(new HelloWorld("제목1", "내용1", "글쓴이1"));
        list.add(new HelloWorld("제목2", "내용2", "글쓴이2"));
        list.add(new HelloWorld("제목3", "내용3", "글쓴이3"));
        list.add(new HelloWorld("제목4", "내용4", "글쓴이4"));
        list.add(new HelloWorld("제목5", "내용5", "글쓴이5"));
        
        int size = list.size();
        System.out.println(size);
    }
}
