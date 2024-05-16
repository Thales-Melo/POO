import java.util.Locale;

public class Retangulo extends Poligono {
    private Ponto pontos[];

    public Retangulo (Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new double[] {p1.dist(p2), p2.dist(p3), p3.dist(p4), p4.dist(p1)});
        this.pontos = new Ponto[4];
        this.pontos = new Ponto [] {p1, p2, p3, p4};
    }

    @Override
    public double calculaPerimetro () {
        return this.pontos[0].dist(this.pontos[1]) + this.pontos[1].dist(this.pontos[2]) +
               this.pontos[2].dist(this.pontos[3]) + this.pontos[3].dist(this.pontos[0]); 
    }

    @Override
    public double calculaArea () {
        return this.pontos[0].dist(this.pontos[1]) * this.pontos[1].dist(this.pontos[2]);
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "O Retângulo que começa em %s tem perímetro = %.1f e área = %.1f\n", 
        this.pontos[0], this.calculaPerimetro(), this.calculaArea());
    }

}
