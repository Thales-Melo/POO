public abstract class Poligono implements Forma {
    private double[] lados;

    public Poligono (double... lados) {
        this.lados = lados;
    }

    @Override
    public double calculaPerimetro() {
        double soma = 0;
        for (int i=0; i<this.lados.length; i++) {
            soma += this.lados[i];
        }
        
        return soma;
    }

}
