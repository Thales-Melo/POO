public class Retangulo extends Quadrilatero { 

    public Retangulo (double base, double altura) {
        super (base, altura, base, altura);
    }

    public double getAltura() {
        return this.lados[1];
    }

    public double getBase() {
        return this.lados[0];
    }

    @Override  
    public String toString () {
        return String.format("Retangulo de base %.2f e altura %.2f - perimetro: %.2f; area: %.2f.", this.lados[0], this.lados[1], this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

}
