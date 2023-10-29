package homework.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ChangeFormatOfDate {
    public void formatOfDate(String date) {
        String strDate = date;

        SimpleDateFormat oldFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("MMMM, d, yyyy HH:mm", Locale.ENGLISH);

        try {
            Date localDate = oldFormat.parse(strDate);
            String newDate = newFormat.format(localDate);
            System.out.println(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
