import java.util.Scanner;

public class J1_19 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        PessoaManager listaPessoas = new PessoaManager();
        
        String verify = input.nextLine();
        
        while (verify.equals(".") == false) {
            String entry[] = verify.split(";");
            String alturaComVirgula[] = entry[2].split(",");
            double altura = Double.parseDouble(alturaComVirgula[0]) + 0.01*Double.parseDouble(alturaComVirgula[1]); 

            Pessoa pessoa = new Pessoa(entry[0], Integer.parseInt(entry[1]), altura);
        
            listaPessoas.add(pessoa);
            
            verify = input.nextLine();
        }

        listaPessoas.print(1);
        System.out.println();
        listaPessoas.print(2);
        System.out.println();
        listaPessoas.print(3);
        
        input.close();
    }
}
