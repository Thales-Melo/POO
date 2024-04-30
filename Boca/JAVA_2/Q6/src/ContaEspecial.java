public class ContaEspecial extends Conta {
    private static final double TAXA_DE_SAQUE = 0.001;

    public ContaEspecial () {
        super();
    }

    @Override
    public void sacar (double money) {
        this.saldo -= money+(money*TAXA_DE_SAQUE);
    }

}
