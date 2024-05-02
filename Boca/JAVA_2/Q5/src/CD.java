public class CD extends Produto {
    private int numFaixas;

    public CD (int codigoDeBarras, String nome, double preco, int numFaixas) {
        super(codigoDeBarras, nome, preco);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }


}
