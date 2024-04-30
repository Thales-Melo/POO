public class CD extends Produto {
    private int numFaixas;

    public CD (String nome, double preco, int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }
    

    @Override
    public String toString() {
        return super.toString() + String.format(" - %d faixas", numFaixas);
    }

}
