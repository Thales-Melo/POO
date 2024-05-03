public class Cachorro extends Animal {
    public Cachorro (String nome) {
        this.nome = nome;
    }

    @Override
    public String getEspecie() {
        return "lupus";
    }

    @Override
    public String getGenero() {
        return "Canis";
    }

    @Override
    public String getSubEspecie() {
        return "familiaris";    
    }


    @Override
    public boolean predar(Animal animal) {
        return false;
    }


    @Override
    public String emitirSom() {
        return "auau";
    }
    
    
}
