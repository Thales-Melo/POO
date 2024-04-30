public class Quadrado extends Quadrilatero {
    private double lado;
    
    public Quadrado (double lado) {
        super (lado, lado, lado, lado);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }


    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return String.format("Quadrado de lado %.2f - perimetro: %.2f; area: %.2f", this.lado, this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

}
