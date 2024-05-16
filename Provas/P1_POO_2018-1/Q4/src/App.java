import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Que tipo de conta você deseja criar?");
        System.out.println("\"CC\" -> Conta Corrente Padrão");
        System.out.println("\"CE\" -> Conta Corrente Especial");

        String verify = input.nextLine();

        ContaCorrente conta = null;

        if (verify.equals("CC")) {
            conta = new ContaCorrente();
        }
        
        else if (verify.equals("CE")) {
            conta = new ContaEspecial();
        }

        else {
            System.out.println("Tipo errado selecionado");
            input.close();
            return;
        }

        conta.depositar(10000);
        
        conta.sacar(5000);
        
        System.out.println(conta);

        input.close();
    }
}
