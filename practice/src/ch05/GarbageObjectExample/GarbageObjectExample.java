package ch05.GarbageObjectExample;

public class GarbageObjectExample {
    public static void main(String[] args){
        String hobby = "여행";
        hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듬 -> 컬렉팅

        String kind1 = "자동차";
        String kind2 = kind1;

        kind1 = null; // "자동차"에 해당하는 String 객체를 비워도 kind2가 해당 번지수를 쓰고있으니 쓰레기 X

        System.out.println("kind2" + kind2);
    }
}