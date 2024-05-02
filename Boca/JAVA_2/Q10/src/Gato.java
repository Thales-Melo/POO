public class Gato extends Animal {
    public Gato (String nome) {
        super(nome);
    }


    @Override
    String getEspecie() {
        return "silvestris";
    }


    @Override
    String getGenero() {
        return "Felis";
    }


    @Override
    String getSubEspecie() {
        return "catus";    
    }


    @Override
    boolean predar(Animal animal) {
        return false;
    }

    
    @Override
    String emitirSom() {
        return "miau";
    }


}
