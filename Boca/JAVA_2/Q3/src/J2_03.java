import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J2_03 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        List <Cliente> listaClientes = new ArrayList<Cliente>();

        String verify = "+";

        while (verify.equals(".") == false) {
            String name = input.nextLine();
            Cliente client = new Cliente(name);
            verify = input.nextLine();
            
            while (verify.equals("+") == false) {
                client.setCPF(verify);
                verify = input.nextLine();
                if (verify.equals(".") == true) {
                    break;
                }
            }

            listaClientes.add(client);
        }


        for (int i=0; i<listaClientes.size(); i++) {
            String CPF = listaClientes.get(i).getCPF();
            if (CPF != null) {
                System.out.println(listaClientes.get(i).getNome() + " " + CPF);
            }

            else {
                System.out.println(listaClientes.get(i).getNome());
            }
        }

        input.close();
    }
}
