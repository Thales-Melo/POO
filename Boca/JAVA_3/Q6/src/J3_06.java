import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class J3_06 {
    public static void main(String[] args) throws Exception {
        
        PrintStream out = new PrintStream(System.out, true, "UTF-8");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner input = new Scanner(System.in);
        String event = input.nextLine();
        String dateString = input.nextLine();
        input.close();


        Date date = dateFormat.parse(dateString);
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE", new Locale("pt", "BR"));
        String dayOfTheWeek = dayOfTheWeekFormat.format(date);

        dayOfTheWeek = dayOfTheWeek.substring(0, 1).toUpperCase() + dayOfTheWeek.substring(1).toLowerCase();

        out.printf("%s - ocorreu num(a) %s\n", event, dayOfTheWeek);
    }   
}

