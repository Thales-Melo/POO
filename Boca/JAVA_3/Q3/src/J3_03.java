import java.util.Scanner;

public class J3_03 {
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
                try {
                    conta.depositar(Double.parseDouble(entry[1]));
                    System.out.println(conta.toString());
                } catch (ValorNegativoException e) {
                    System.out.println(e.getMessage());
                    input.close();
                    return;
                }
            }

            else if (entry[0].equals("-")) {
                try {
                    conta.sacar(Double.parseDouble(entry[1]));
                    System.out.println(conta.toString());
                }
                catch (SaldoInsuficienteException e) {
                    System.out.println(e.getMessage());
                    input.close();
                    return;
                }
                catch (ValorNegativoException e) {
                    System.out.println(e.getMessage());
                    input.close();
                    return;
                }
            }

            verify = input.nextLine();
        }

        input.close();
    }
}
