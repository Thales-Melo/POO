import java.util.Locale;

public class Carro {
    protected String nome;
    protected double combustivel;

    private static final int VELOCIDADE = 100; // km/h
    private static final int KM_POR_LITRO = 10;

    public Carro (String nome, double combustivel) {
        this.nome = nome;
        this.combustivel = combustivel;
    }

    private double combustivelGasto(double distancia) { 
        return (double)distancia/KM_POR_LITRO;
    }

    private double tempoGasto (double distancia) {
        return (double)distancia/VELOCIDADE;
    } 

    public void andar (double d) {
        this.combustivel -= combustivelGasto(d);
        // System.out.println(this.nome + " andou " + d + " km em " + tempoGasto(d) + 
        // " horas e agora possui " + this.combustivel + " litros de combustivel");
        System.out.printf(Locale.US, "%s andou %.1f km em %.1f horas e agora possui %.1f litros de combustivel\n",
                         this.nome,  d,     tempoGasto(d),         this.combustivel);
    }
}
