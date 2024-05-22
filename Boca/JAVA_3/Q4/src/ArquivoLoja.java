import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoLoja {

    public static Loja readLoja (int size, String path) {
        Loja loja = new Loja(size);

        try {
            FileReader file = new FileReader(path);
            BufferedReader readFile = new BufferedReader(file);
            String line = "";

            try {
                while ((line = readFile.readLine()) != null) {
                    String[] lineSplited = line.split(",");
                    loja.addVendaFilial(Integer.parseInt(lineSplited[0]), Double.parseDouble(lineSplited[1]));
                }
                readFile.close();
                
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } 
        catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
        }

        return loja;
    }
}
