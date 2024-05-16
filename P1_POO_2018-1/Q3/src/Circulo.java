import java.util.Locale;

public class Circulo implements Forma {
    private Ponto centro;
    private double raio;

    public Circulo (Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public double calculaArea () {
        return Math.PI*this.raio*this.raio;
    }

    @Override
    public double calculaPerimetro () {
        return 2*Math.PI*this.raio;
    }

    @Override
    public String toString () {
        return String.format(Locale.US, "O círculo com centro em %s tem perímetro = %.14f e área = %.14f", 
                            this.centro, this.calculaPerimetro(), this.calculaArea());
    }

}
