import java.util.Locale;

public class ContaCorrente {
    protected double saldo;

    public ContaCorrente () {
        this.saldo = 0;
    }

    public void depositar (double dinheiro) {
        this.saldo += dinheiro;
    }

    public void sacar (double dinheiro) {
        this.saldo -= ( dinheiro + (dinheiro*0.005) );
    }

    @Override
    public String toString () {
        return String.format(Locale.US, "Saldo = %.2f", this.saldo);
    }
}
