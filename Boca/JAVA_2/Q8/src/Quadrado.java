public class Quadrado extends Quadrilatero {
    
    public Quadrado (double lado) {
        super ();
        this.lados[0] = lado;
        this.lados[1] = lado;
        this.lados[2] = lado;
        this.lados[3] = lado;
    }

    public double getLado() {
        return this.lados[0];
    }

    @Override
    public String toString() {
        return String.format("Quadrado de lado %.2f - perimetro: %.2f; area: %.2f.", this.lados[0], this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

    @Override
    public double calcularArea() {
        return this.lados[0] * this.lados[0];
    }

}
