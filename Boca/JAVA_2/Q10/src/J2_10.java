import java.util.Scanner;

public class J2_10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Selva selva = new Selva();
        
        while (true) {
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] entry = line.split(" - ");

            if (selva.animalExiste(entry[0])) {

                Animal animal = null;

                if (entry[0].equals("Cachorro")) {
                    animal = new Cachorro(entry[1]);
                }
                else if (entry[0].equals("Gato")) {
                    animal = new Gato(entry[1]);
                }
                else if (entry[0].equals("Leao")) {
                    animal = new Leao(entry[1]);
                }
                else if (entry[0].equals("Lobo")) {
                    animal = new Lobo(entry[1]);
                }

                selva.add(animal);
            }

        }

        selva.guerraNaSelva();

        selva.reiDaSelva();

        input.close();
    }
}
