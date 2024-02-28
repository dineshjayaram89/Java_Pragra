package feb20.enumDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnumDemoClass {
    public static void main(String[] args) {
        DaysofTheWeek day = DaysofTheWeek.Friday;
        System.out.println(day.dayOfTheWeek);
        System.out.println("Is it the weekend? " + day.isWeekend(day));
        for (DaysofTheWeek value : DaysofTheWeek.values()) {
            System.out.println(value);
        }
        System.out.println();
        DaysofTheWeek[] d = DaysofTheWeek.values();
        for (DaysofTheWeek values : d) {
            System.out.println(values);
        }
    }

}