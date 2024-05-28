import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class J3_07 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String[] languageCode = input.nextLine().split("\\s+");
        Locale locale = new Locale(languageCode[0], languageCode[1]);

        ResourceBundle bundle = ResourceBundle.getBundle("mensagens", locale);
        String fact = bundle.getString(input.nextLine());

        String dayOfTheWeek = Data.getDayOfWeek(input.nextLine(), locale);

        System.out.printf("%s - %s %s\n", fact, bundle.getString("text.occurredin"), dayOfTheWeek);

        input.close();
    }
}

