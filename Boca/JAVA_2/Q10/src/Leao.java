public class Leao extends Animal {
    public Leao (String nome) {
        this.nome = nome;    }
    

    @Override
    public String getEspecie() {
        return "leo";
    }


    @Override
    public String getGenero() {
        return "Panthera";
    }


    @Override
    public String getSubEspecie() {
        return "";    
    }


    @Override
    public boolean predar(Animal animal) {
        if (!(animal instanceof Leao)) {
            return true;
        }
        return false;
    }


    @Override
    public String emitirSom() {
        return "rawr";
    }


}
