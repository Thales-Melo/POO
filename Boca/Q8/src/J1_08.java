import java.util.Scanner;

public class J1_08 {
    public static void main(String[] args) throws Exception {
        Empresa company = new Empresa();
        Scanner input = new Scanner(System.in);

        String line[] = input.nextLine().split("\\s+");
        
        company.setName(line[0]);
        company.setCNPJ(line[1]);
        int n_deps = (int)Double.parseDouble(line[2]);

        for (int i=0; i<n_deps; i++) {
            line = input.nextLine().split("\\s+");
            // 
        }


        

        input.close();
    }
}
