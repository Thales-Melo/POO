import java.util.Locale;

public class CarroTurbinado extends Carro {
    private static final int VELOCIDADE = 150;
    private static final int KM_POR_LITRO = 6;
    
    public CarroTurbinado (String nome, double combustivel) {
        super(nome, combustivel);
    }   

    private double tempoGasto(double distancia) {
        return (double)distancia/VELOCIDADE;
    }

    private double combustivelGasto(double distancia) {
        return (double)distancia/KM_POR_LITRO;
    }

    @Override
    public void andar (double d) {
        this.combustivel -= combustivelGasto(d);
        // System.out.println(this.nome + " andou " + d + " km em " + tempoGasto(d) + 
        // " horas e agora possui " + this.combustivel + " litros de combustivel");
        System.out.printf(Locale.US, "%s andou %.1f km em %.1f horas e agora possui %.1f litros de combustivel\n",
                         this.nome,  d,     tempoGasto(d),         this.combustivel);
    }
}
