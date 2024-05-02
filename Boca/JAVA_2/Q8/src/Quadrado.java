public class Quadrado extends Quadrilatero {
    
    public Quadrado (double lado) {
        super (lado, lado, lado, lado);
    }

    public double getLado() {
        return this.lados[0];
    }

    @Override
    public String toString() {
        return String.format("Quadrado de lado %.2f - perimetro: %.2f; area: %.2f.", this.lados[0], this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

}
