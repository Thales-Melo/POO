public class Circulo extends Forma {
    private double raio;
    private static final double PI = 3.14;

    public Circulo (double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea () {
        return PI*raio*raio;
    }

    @Override
    public double calcularPerimetro () {
        return 2*PI*raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return String.format("Circulo de raio %.2f - perimetro: %.2f; area: %.2f", this.raio, this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

}
