public class ContaEspecial extends Conta {
    private static final double TAXA_DE_SAQUE = 0.001;

    public ContaEspecial () {
        super();
    }

    @Override
    public void sacar (double money) throws SaldoInsuficienteException, ValorNegativoException {
        if (money < 0) {
            throw new ValorNegativoException(money);
        }
        else if (money > this.saldo) {
            throw new SaldoInsuficienteException(this.saldo, money);
        }
        this.saldo -= (money+(money*TAXA_DE_SAQUE));
    }

}
