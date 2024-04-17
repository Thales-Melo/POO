import java.util.Scanner;

public class J1_16 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        Program system = new Program();

        system.readUsers(n, input);

        system.searchMode(input);
        
        input.close();
    }
}
