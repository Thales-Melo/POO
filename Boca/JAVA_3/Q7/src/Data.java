import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Data {
    public static String getDayOfWeek(String dateString, Locale locale) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateString);

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE", locale);
        String dayOfTheWeek = dayOfTheWeekFormat.format(date);
        
        return dayOfTheWeek;
    }
}
