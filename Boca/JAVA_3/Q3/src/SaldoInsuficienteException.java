import java.util.Locale;

public class SaldoInsuficienteException extends Exception {
    private Double saldo;
    private Double valor;
    private static final Locale br = new Locale("pt", "BR");

    public Double getSaldo() {
        return saldo;
    }

    public Double getValor() {
        return valor;
    }

    public SaldoInsuficienteException (Double valor, Double saldo) {
        super(String.format(br, "Voce deseja sacar R$ %.2f, porem seu saldo eh de apenas R$ %.2f.", valor, saldo));
        this.saldo = saldo;
        this.valor = valor;
    }

}
