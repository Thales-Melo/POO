public class Lobo extends Animal {
    public Lobo (String nome) {
        this.nome = nome;    }


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
        return "";    
    }


    @Override
    public boolean predar(Animal animal) {
        if (!(animal instanceof Lobo || animal instanceof Leao)) {
            return true;
        }
        return false;
    }


    @Override
    public String emitirSom() {
        return "howl";
    }

    
}
