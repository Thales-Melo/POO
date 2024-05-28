import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class J3_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
           
            String date = input.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(date));

            while (true) {
                String line = input.nextLine();
                String[] lineSplitted = line.split("\\s+");
                String op = lineSplitted[0];
                
                switch (op) {
                    case "dia":
                        int days = Integer.parseInt(lineSplitted[1]);
                        calendar.add(Calendar.DAY_OF_MONTH, days);
                        break;
    
                    case "mes":
                        int months = Integer.parseInt(lineSplitted[1]);
                        calendar.add(Calendar.MONTH, months);
                        break;
    
                    case "ano":
                        int years = Integer.parseInt(lineSplitted[1]);
                        calendar.add(Calendar.YEAR, years);
                        break;

                    case "print":
                        String format = line.substring(6).trim();
                        SimpleDateFormat outputFormat = new SimpleDateFormat(format, new Locale("pt", "BR"));
                        String formattedDate = outputFormat.format(calendar.getTime());
                        System.out.println(diaDaSemanaEMesComPrimeiraLetraMaiuscula(formattedDate));
                        break;

                    case "sair":
                        break;
                }

                if (op.equals("sair")) {
                    break;
                }
            }


        } catch (Exception e) {

        } finally {
            input.close();
        }

    }

    // Fiz essa função pq não consegui printar diretamente com a primeira letra do dia da semana e do mês maiúsculas
    // Gambiarra mas é o que temos kkkk
    private static String diaDaSemanaEMesComPrimeiraLetraMaiuscula(String str) {
        String[] words = str.split(" ");
        StringBuilder stringFinal = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || i == 3) { 
                stringFinal.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
            } 
            else {
                stringFinal.append(words[i]);
            }
            if (i < words.length - 1) {
                stringFinal.append(" ");
            }
        }
        return stringFinal.toString();
    }
}