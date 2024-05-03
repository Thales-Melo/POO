abstract class Animal {
    protected String nome;


    public String getNome() {
        return nome;
    }


    public abstract String emitirSom();


    public abstract boolean predar(Animal animal);


    public abstract String getGenero();


    public abstract String getEspecie();


    public abstract String getSubEspecie();


    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.getNome(), this.getGenero(), this.getEspecie(), this.getSubEspecie(), this.emitirSom());
    }
    

}
