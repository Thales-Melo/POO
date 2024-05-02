public class DVD extends Produto {
    private int duracao;

    public DVD (int codigoDeBarras, String nome, double preco, int duracao) {
        super(codigoDeBarras, nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
    
}
