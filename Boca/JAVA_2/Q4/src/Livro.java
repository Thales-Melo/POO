public class Livro extends Produto {
    private String autor;

    public Livro (String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - %s", autor);
    }
    // Harry Potter e as Reliquias da Morte (R$ 39.51) - J. K. Rowling
}
