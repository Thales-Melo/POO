public class Artigo {
    private String nome;
    private String tipoArtigo;
    private String nomeVeiculo;
    private String indiceQualis;
    private int paginaInicial;
    private int paginaFinal;

    public Artigo (String nome, String tipoArtigo, String nomeVeiculo, String indiceQualis, int paginaInicial, int paginaFinal) {
        this.nome = nome;
        this.tipoArtigo = tipoArtigo;
        this.nomeVeiculo = nomeVeiculo;
        this.indiceQualis = indiceQualis;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
    }


    public String getNome() {
        return nome;
    }

    public String getTipoArtigo() {
        return tipoArtigo;
    }
    
    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public String getIndiceQualis() {
        return this.indiceQualis;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }


    public void print() {
        System.out.println(this.nome);
        System.out.println(this.nomeVeiculo);
        System.out.println(this.indiceQualis);
        System.out.println(this.paginaInicial);
        System.out.println(this.paginaFinal);
    }

}
