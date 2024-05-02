abstract class Quadrilatero implements Forma {
    protected double[] lados;

    public Quadrilatero (double lado_1, double lado_2, double lado_3, double lado_4) {
        this.lados = new double[4];
        this.lados[0] = lado_1;
        this.lados[1] = lado_2;
        this.lados[2] = lado_3;
        this.lados[3] = lado_4;
    }

    @Override
    public double calcularArea() {
        return this.lados[0] * this.lados[1];
    }

    @Override
    public double calcularPerimetro () {
        return this.lados[0]+this.lados[1]+this.lados[2]+this.lados[3];
    }

}
