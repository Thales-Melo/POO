public class Gato extends Animal {
    public Gato (String nome) {
        this.nome = nome;    }


    @Override
    public String getEspecie() {
        return "silvestris";
    }


    @Override
    public String getGenero() {
        return "Felis";
    }


    @Override
    public String getSubEspecie() {
        return "catus";    
    }


    @Override
    public boolean predar(Animal animal) {
        return false;
    }

    
    @Override
    public String emitirSom() {
        return "miau";
    }


}
