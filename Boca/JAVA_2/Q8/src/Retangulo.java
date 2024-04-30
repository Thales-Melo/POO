public class Retangulo extends Quadrilatero { 
    private double base;
    private double altura;

    public Retangulo (double base, double altura) {
        super (base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override  
    public String toString () {
        return String.format("Retangulo de base %.2f e altura %.2f - perimetro: %.2f; area: %.2f", this.base, this.altura, this.calcularPerimetro(), this.calcularArea()).replace(",", ".");
    }

}
