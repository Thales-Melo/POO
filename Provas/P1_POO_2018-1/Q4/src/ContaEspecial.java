public class ContaEspecial extends ContaCorrente {
    public ContaEspecial () {
        this.saldo = 0;
    }

    @Override
    public void sacar (double dinheiro) {
        this.saldo -= ( dinheiro + (dinheiro*0.001) );
    }

}
