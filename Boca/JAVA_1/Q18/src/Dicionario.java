import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map <String, String> lista;

    public Dicionario () {
        lista = new HashMap<String, String>();
    }

    public void add (String key, String value) {
        this.lista.put(key, value);
    }

    public boolean containsKey (String key) {
        return this.lista.containsKey(key);
    }

    public void printValue (String key) {
        if (containsKey(key)) {
            System.out.println(this.lista.get(key));
        }
        else {
            System.out.println("Termo nao encontrado: " + key);
        }
    }

}
