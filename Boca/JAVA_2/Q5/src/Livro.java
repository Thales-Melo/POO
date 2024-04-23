public class Livro extends Produto {
    private String autor;

    public Livro (int codigoDeBarras, String nome, double preco, String autor) {
        super(codigoDeBarras, nome, preco);
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
