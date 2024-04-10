public class ProdutoNoCarrinho {
    Produto produto;
    int quantidade;

    public ProdutoNoCarrinho (String nome, double preco, int qtd) {
        quantidade = qtd;
        produto = new Produto(nome, preco);
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double custoAcumulado () {
        return produto.getPreco()*quantidade;
    }
    
    public void print () {
        System.out.printf("* %dx %s = R$ %.2f\n", quantidade, produto.getNome(), custoAcumulado());
    }


}
