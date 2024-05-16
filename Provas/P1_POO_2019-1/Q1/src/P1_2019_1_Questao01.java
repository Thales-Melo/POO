import java.util.Scanner;

public class P1_2019_1_Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String nomeCarro1 = input.nextLine();
        String nomeCarro2 = input.nextLine();

        double quantidadeCombustivel = Double.parseDouble(input.nextLine());
        double distanciaPercorrida = Double.parseDouble(input.nextLine());

        Carro carro1 = new Carro(nomeCarro1, quantidadeCombustivel);
        Carro carro2 = new CarroTurbinado(nomeCarro2, quantidadeCombustivel);

        carro1.andar(distanciaPercorrida);        
        carro2.andar(distanciaPercorrida);

        input.close();
    }
}
