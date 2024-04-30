public class DVD extends Produto {
    private int duracao;

    public DVD (String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
    

    @Override
    public String toString() {
        return super.toString() + String.format(" - %d minutos", duracao);
    }

    @Override
    public boolean ehCaro () {
        return this.preco > 50;
    }


}
