import java.util.ArrayList;
import java.util.List;

public class Selva {
    private List<Animal> listaAnimais;
    private List<String> animaisExistentes;


    public Selva () {
        this.listaAnimais = new ArrayList<Animal>();
        this.animaisExistentes = new ArrayList <String>();
        animaisExistentes.add("Cachorro");
        animaisExistentes.add("Gato");
        animaisExistentes.add("Leao");
        animaisExistentes.add("Lobo");
    }


    public void add (Animal animal) {
        if (animal != null) {
            listaAnimais.add(animal);
        }
    }


    public boolean animalExiste (String nome) {
        if (animaisExistentes.contains(nome)) {
            return true;
        }
        else {
            System.out.println("Tipo nao existe!");
            return false;
        }
    }


    public boolean briga (Animal predador, Animal presa) {
        if (predador.predar(presa)) {
            this.listaAnimais.remove(presa);
            return true;
        }
        else if (presa.predar(predador)) {
            this.listaAnimais.remove(predador);
            return true;
        }

        return false;
    }


    public void guerraNaSelva () {
        for (int i=0; i<listaAnimais.size(); i++) {
            for (int k=i+1; k<listaAnimais.size(); k++) {
                if (briga(listaAnimais.get(i), listaAnimais.get(k))) {
                    k--;
                } 
            }
        }
    }
    

    public void reiDaSelva () {
        if (listaAnimais.size() > 0) {
            System.out.println("O(s) rei(s) da selva eh/sao:");
            boolean flagGato = false;
            for (Animal animal : listaAnimais) {
                if (animal instanceof Gato) {
                    System.out.println(animal);
                    flagGato = true;
                }
            }
            if (!(flagGato)) {
                for (Animal animal : listaAnimais) {
                    System.out.println(animal);
                }
            }
        }
        System.out.println();
    }


}
