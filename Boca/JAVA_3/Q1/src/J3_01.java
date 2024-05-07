import java.util.Scanner;

public class J3_01 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        String[] listaStrings = new String[N];

        for (int i=0; i<N; i++) {
            listaStrings[i] = input.nextLine();
        }

        int pos = input.nextInt();
        input.nextLine();

        try {
            System.out.println("Elemento na posicao " + pos + ": " + listaStrings[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao " + pos + " esta fora dos limites do vetor.");
        }

        input.close();
    }
}
