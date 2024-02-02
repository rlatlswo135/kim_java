package ch05.WeekExample;

import ch05.Week;
import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args){
        Week today = null;

        Calendar cal = Calendar.getInstance();

        // 일(1) ~ 토(7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1: today = Week.SUNDAY;
            case 2: today = Week.MONDAY;
            case 3: today = Week.TUESDAY;
            case 4: today = Week.WEDNESDAY;
            case 5: today = Week.THURSDAY;
            case 6: today = Week.FRIDAY;
            case 7: today = Week.SATURDAY;
        }

        if(today == Week.SUNDAY){
            System.out.println("일요일에는 축구");
        }else{
            System.out.println("평일에는 노가다");
        }
    }
}
