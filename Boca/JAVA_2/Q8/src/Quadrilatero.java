abstract class Quadrilatero extends Forma {
    private double lado_1;
    private double lado_2;
    private double lado_3;
    private double lado_4;

    public Quadrilatero (double lado_1, double lado_2, double lado_3, double lado_4) {
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
        this.lado_4 = lado_4;
    }

    @Override
    public double calcularPerimetro () {
        return this.lado_1+this.lado_2+this.lado_3+this.lado_4;
    }

}
