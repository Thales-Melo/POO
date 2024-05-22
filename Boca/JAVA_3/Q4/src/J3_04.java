import java.util.Scanner;

public class J3_04 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Loja loja = ArquivoLoja.readLoja(4, input.nextLine());

        loja.resumo();

        input.close();

    }
}
