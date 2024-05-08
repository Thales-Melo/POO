import java.util.Locale;

public class Conta {
    protected double saldo;
    private static final double TAXA_DE_SAQUE = 0.005;
    private static final Locale br = new Locale("pt", "BR");

    public Conta () {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double money) throws ValorNegativoException {
        if (money < 0) {
            throw new ValorNegativoException(money);
        }
        this.saldo += money;
    }

    public void sacar (double money) throws SaldoInsuficienteException, ValorNegativoException{
        if (money < 0) {
            throw new ValorNegativoException(money);
        }
        else if (money > this.saldo) {
            throw new SaldoInsuficienteException(money, this.saldo);
        }
        this.saldo -= (money+(money*TAXA_DE_SAQUE));
    }

    @Override
    public String toString () {
        return String.format(br, "R$ %.2f", this.saldo).replace(".", ",");
    }

}
