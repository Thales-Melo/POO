public class Lobo extends Animal {
    public Lobo (String nome) {
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
        return "";    
    }


    @Override
    boolean predar(Animal animal) {
        if (!(animal instanceof Lobo && animal instanceof Leao)) {
            return true;
        }
        return false;
    }


    @Override
    String emitirSom() {
        return "howl";
    }

    
}
