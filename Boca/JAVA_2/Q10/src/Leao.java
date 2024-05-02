public class Leao extends Animal {
    public Leao (String nome) {
        super(nome);
    }
    

    @Override
    String getEspecie() {
        return "leo";
    }


    @Override
    String getGenero() {
        return "Panthera";
    }


    @Override
    String getSubEspecie() {
        return "";    
    }


    @Override
    boolean predar(Animal animal) {
        if (!(animal instanceof Leao)) {
            return true;
        }
        return false;
    }


    @Override
    String emitirSom() {
        return "rawr";
    }


}
