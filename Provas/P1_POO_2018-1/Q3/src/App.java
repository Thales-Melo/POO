import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Forma[] formas = new Forma[] {
            new Retangulo(new Ponto(1, 1), new Ponto(1, 11), new Ponto(6, 11), new Ponto(6, 1)),
            new Circulo(new Ponto(6, 11), 5)
        };

        for (Forma f : formas) System.out.println(f);


        input.close();
    }
}
