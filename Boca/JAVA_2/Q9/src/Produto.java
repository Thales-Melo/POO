import java.util.Locale;

abstract class Produto implements Comparable<Produto> {
    protected String nome;
    protected double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    @Override
    public String toString () {
        return String.format(Locale.US, "%s (R$ %.2f)", nome, preco);
    }
    
    
    @Override
    public int compareTo (Produto produto) {
        if (this.preco < produto.getPreco()) {
            return 1;
        }
        
        else if (this.preco > produto.getPreco()) {
            return -1;
        }
        
        else {
            return this.nome.compareToIgnoreCase(produto.getNome());
        }
    }
    
    abstract boolean ehCaro ();   
}
