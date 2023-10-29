package homework.day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateAndTimeStatic {
    public static void printDateAndTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("d MMMM, yyyy, k часа m минут");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Сейчас на дворе: " + formatter.format(date));
    }
}
