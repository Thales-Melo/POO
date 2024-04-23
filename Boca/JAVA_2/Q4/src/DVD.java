public class DVD extends Produto {
    private double duracao;

    public DVD (String nome, double preco, double duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }
    
}
