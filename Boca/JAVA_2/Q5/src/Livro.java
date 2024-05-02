public class Livro extends Produto {
    private String autor;

    public Livro (int codigoDeBarras, String nome, double preco, String autor) {
        super(codigoDeBarras, nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

}
