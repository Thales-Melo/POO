public class Conta {
    protected double saldo;
    private static final double TAXA_DE_SAQUE = 0.005;


    public Conta () {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double money) {
        this.saldo += money;
    }

    public void sacar (double money) {
        this.saldo -= (money+(money*TAXA_DE_SAQUE));
    }

    @Override
    public String toString () {
        return String.format("R$ %.2f", this.saldo).replace(".", ",");
    }

}
