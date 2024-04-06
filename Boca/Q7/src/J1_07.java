import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class J1_07 {
    public static void main(String[] args) throws Exception {
        Ponto[] points = new Ponto[3];
        Triangulo triangle = new Triangulo();
        Scanner input = new Scanner(System.in);

        String[] linha = input.nextLine().split("\\s+");

        for (int i=0; i<6; i+=2) {
            points[i/2] = new Ponto();
            points[i/2].setX(Double.parseDouble(linha[i]));
            points[i/2].setY(Double.parseDouble(linha[i+1]));
        }

        triangle.setPoints(points);
        
        DecimalFormat df = new DecimalFormat("0.00000", DecimalFormatSymbols.getInstance(Locale.US));
        System.out.println(df.format(triangle.perimeter()));

        input.close();
    }
}
