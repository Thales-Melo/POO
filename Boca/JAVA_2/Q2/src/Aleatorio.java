import java.util.Random;

public class Aleatorio {
    private Random gerador;
    private static int VALOR_MAXIMO_DEFAULT;
    private int numGenerated;

    public Aleatorio () {
        gerador = new Random();
        VALOR_MAXIMO_DEFAULT = 100;
        numGenerated = gerador.nextInt(VALOR_MAXIMO_DEFAULT);
    }

    public Aleatorio (int valor_max, long seed) {
        gerador = new Random(seed);
        VALOR_MAXIMO_DEFAULT = valor_max;
        numGenerated = gerador.nextInt(VALOR_MAXIMO_DEFAULT);
    }

    public void renovar() {
        numGenerated = gerador.nextInt(VALOR_MAXIMO_DEFAULT);
    }

    public int getNumGenerated() {
        return numGenerated;
    }

}

