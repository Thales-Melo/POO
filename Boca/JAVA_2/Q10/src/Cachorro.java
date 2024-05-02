public class Cachorro extends Animal {
    public Cachorro (String nome) {
        super(nome);
    }


    @Override
    String getEspecie() {
        return "lupus";
    }


    @Override
    String getGenero() {
        return "Canis";
    }


    @Override
    String getSubEspecie() {
        return "familiaris";    
    }


    @Override
    boolean predar(Animal animal) {
        return false;
    }


    @Override
    String emitirSom() {
        return "auau";
    }
    
    
}
