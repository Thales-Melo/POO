import java.util.Scanner;

public class J2_12 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Detran detran = new Detran();

        while (true) {
            String line = input.nextLine();

            if (line.isEmpty()) {
                break;
            }

            String[] entry = line.split("\\s+");

            switch (entry[0]) {
                case "Cam":
                    Caminhao caminhao = new Caminhao();
                    caminhao.setVelocMax(Float.parseFloat(entry[1]));
                    caminhao.setNumRodas(Integer.parseInt(entry[2]));
                    caminhao.setPlaca(entry[3]);
                    caminhao.setCombustivel(entry[4]);
                    caminhao.setMarca(entry[5]);
                    caminhao.setNomeDono(entry[6]);
                    detran.add(caminhao);
                    break;
                    
                case "Car":
                    Carro carro = new Carro();
                    carro.setVelocMax(Float.parseFloat(entry[1]));
                    carro.setNumRodas(Integer.parseInt(entry[2]));
                    carro.setPlaca(entry[3]);
                    carro.setCombustivel(entry[4]);
                    carro.setMarca(entry[5]);
                    carro.setNomeDono(entry[6]);
                    detran.add(carro);
                    break;

                case "Bic":
                    Bicicleta bicicleta = new Bicicleta();
                    bicicleta.setVelocMax(Float.parseFloat(entry[1]));
                    bicicleta.setNumRodas(Integer.parseInt(entry[2]));
                    bicicleta.setMarca(entry[3]);
                    bicicleta.setNomeDono(entry[4]);
                    detran.add(bicicleta);
                    break;

                default:
                    System.out.println("Tipo nao existe!");
                    break;
            }
        }

        detran.print();

        input.close();
    }
}
