import java.util.Scanner;

public class J2_06 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        char tipoConta = input.nextLine().charAt(0);
        Conta conta;

        if (tipoConta == 'C') {
            conta = new Conta();
        }

        else if (tipoConta == 'E') {
            conta = new ContaEspecial();
        }
        
        else {
            conta = null;
        }

        if (conta == null) {
            input.close();
            return;
        }

        String verify = input.nextLine();
        while (verify.equals(".") == false) {
            String[] entry = verify.split("\\s+");
            if (entry[0].equals("+")) {
                conta.depositar(Double.parseDouble(entry[1]));
                System.out.println(conta.toString());
            }

            else if (entry[0].equals("-")) {
                conta.sacar(Double.parseDouble(entry[1]));
                System.out.println(conta.toString());
            }

            verify = input.nextLine();
        }

        input.close();
    }
}
