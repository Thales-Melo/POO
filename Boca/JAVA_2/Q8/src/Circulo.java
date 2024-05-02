public class Circulo implements Forma {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public double calcularArea () {
        return Math.PI*this.raio*this.raio;
    }

    public double calcularPerimetro () {
        return 2*Math.PI*this.raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public String toString() {
        return String.format("Circulo de raio %.2f - perimetro: %.2f; area: %.2f.", this.raio, this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

}
