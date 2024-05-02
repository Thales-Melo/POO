abstract class Quadrilatero implements Forma {
    protected double[] lados;

    public Quadrilatero () {
        lados = new double[4];
    }


    @Override
    public double calcularPerimetro () {
        return this.lados[0]+this.lados[1]+this.lados[2]+this.lados[3];
    }

}
