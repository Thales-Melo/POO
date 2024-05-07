public class SaldoInsuficienteException extends Exception {
    private Double saldo;
    private Double valor;

    public Double getSaldo() {
        return saldo;
    }

    public Double getValor() {
        return valor;
    }

    public SaldoInsuficienteException (Double saldo, Double valor) {
        super(String.format("Voce deseja sacar %.2lf, porem seu saldo é de apenas %.2lf.", saldo, valor));
        this.saldo = saldo;
        this.valor = valor;
    }

}
