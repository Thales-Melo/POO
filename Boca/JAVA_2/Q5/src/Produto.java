public class Produto {
    protected int codigoDeBarras;
    protected String nome;
    protected double preco;

    public Produto (int codigoDeBarras, String nome, double preco) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }
    
    @Override
    public boolean equals(Object obj) {
        Produto produto = (Produto) obj;
        return codigoDeBarras == produto.codigoDeBarras;
    }

}
