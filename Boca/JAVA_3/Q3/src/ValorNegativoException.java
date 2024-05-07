public class ValorNegativoException extends Exception {
    private Double valor;

    public Double getValor() {
        return valor;
    }
    
    public ValorNegativoException (Double valor) {
        super(String.format("Nao é possivel depositar/sacar um valor negativo: %.2f", valor));
        this.valor = valor;
    }
}
