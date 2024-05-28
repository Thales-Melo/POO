import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class J3_09 {
    public static void main(String[] args) throws Exception {
     
    PrintStream out = new PrintStream(System.out, true, "UTF-8");

    Scanner input = new Scanner(System.in);


    String[] line = input.nextLine().split("\\s+");

    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale(line[1], line[2]));
    NumberFormat br = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    
    out.println(br.format(Double.parseDouble(line[0])) + " = " +
                nf.format(Dinheiro.convertido(Double.parseDouble(line[0]), 
                                              Double.parseDouble(line[3]))));
    
    input.close();
        
    }
}
