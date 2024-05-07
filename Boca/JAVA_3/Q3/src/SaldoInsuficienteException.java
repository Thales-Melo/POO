public class SaldoInsuficienteException extends Exception {
    private Double saldo;
    private Double valor;

    public Double getSaldo() {
        return saldo;
    }

    public Double getValor() {
        return valor;
    }

    public SaldoInsuficienteException (Double valor, Double saldo) {
        super(String.format("Voce deseja sacar R$%.2f, porem seu saldo e de apenas R$%.2f.", valor, saldo));
        this.saldo = saldo;
        this.valor = valor;
    }

}
