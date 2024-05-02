abstract class Animal {
    protected String nome;
    protected String genero;
    protected String especie;
    protected String subEspecie; 


    public Animal (String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    abstract String emitirSom();


    abstract boolean predar(Animal animal);


    abstract String getGenero();


    abstract String getEspecie();


    abstract String getSubEspecie();

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.getNome(), this.getGenero(), this.getEspecie(), this.getSubEspecie(), this.emitirSom());
    }
    
}
