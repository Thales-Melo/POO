import java.util.ArrayList;
import java.util.List;

public class Detran {
    List <Object> listaVeiculos;

    
    public Detran () {
        this.listaVeiculos = new ArrayList<Object>();
    }


    public void add (Object veiculo) {
        if (veiculo != null) {
            this.listaVeiculos.add(veiculo);
        }
    }


    public void print () {
        for (Object veiculo : listaVeiculos) {
            if (veiculo instanceof Carro) {
                Carro carro = (Carro)veiculo;
                String dadosCarro = String.format("%.1f %d %s %s %s %s", carro.getVelocMax(),
                                                                         carro.getNumRodas(),
                                                                         carro.getPlaca(), 
                                                                         carro.getCombustivel(), 
                                                                         carro.getMarca(), 
                                                                         carro.getNomeDono()).replace(",", ".");
                System.out.println(dadosCarro);
                carro.iniciar();
                carro.buzinar();
                carro.parar();
            }
            else if (veiculo instanceof Caminhao) {
                Caminhao caminhao = (Caminhao)veiculo;
                String dadosCaminhao = String.format("%.1f %d %s %s %s %s", caminhao.getVelocMax(),
                                                                         caminhao.getNumRodas(),
                                                                         caminhao.getPlaca(), 
                                                                         caminhao.getCombustivel(), 
                                                                         caminhao.getMarca(), 
                                                                         caminhao.getNomeDono()).replace(",", ".");
                System.out.println(dadosCaminhao);
                caminhao.iniciar();
                caminhao.buzinar();
                caminhao.parar();
            }

            else if (veiculo instanceof Bicicleta) {
                Bicicleta bicicleta = (Bicicleta)veiculo;
                String dadosBicicleta = String.format("%.1f %d %s %s", bicicleta.getVelocMax(),
                                                                       bicicleta.getNumRodas(),
                                                                       bicicleta.getMarca(), 
                                                                       bicicleta.getNomeDono()).replace(",", ".");
                System.out.println(dadosBicicleta);
                bicicleta.iniciar();
                bicicleta.buzinar();
                bicicleta.parar();
            }
        }
        System.out.println();
    }


}
