import java.util.Locale;

public class Ponto {
    private double x;
    private double y;

    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dist (Ponto ponto) {
        return Math.sqrt(Math.pow(this.x-ponto.x, 2) + Math.pow(this.y-ponto.y, 2));
    }

    @Override
    public String toString () {
        return String.format(Locale.US, "(%.1f, %.1f)", this.x, this.y);
    }

}
