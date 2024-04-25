import java.util.Scanner;

public class J1_18 {
    public static void main(String[] args) throws Exception {
        Dicionario dictonary = new Dicionario();

        Scanner input = new Scanner(System.in);

        String verify = input.nextLine();

        while (verify.equals(".") == false) {
            String entry[] = verify.split(" = ");

            String key = entry[0];
            String value = entry[1];

            dictonary.add(key, value);
        
            verify = input.nextLine();
        }

        verify = input.nextLine();

        while (verify.equals(".") == false) {
            dictonary.printValue(verify);
            verify = input.nextLine();
        }

        input.close();
    }
}
