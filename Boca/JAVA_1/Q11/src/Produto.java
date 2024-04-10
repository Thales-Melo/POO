public class Produto {
    private String nome;
    private double preco;

    public Produto (String nomeProduto, double precoProduto) {
        nome = nomeProduto;
        preco = precoProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
}
