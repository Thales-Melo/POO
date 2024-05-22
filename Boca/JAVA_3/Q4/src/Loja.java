public class Loja {

    private Filial[] filiais;

    public Loja (int N) {
        this.filiais = new Filial[N];
        for (int i=0; i<N; i++) {
            this.filiais[i] = new Filial();
        }
    }


    public void addVendaFilial (int numLoja, double valor) {
        this.filiais[numLoja-1].addVenda(valor);
    }


    public void resumo () {
        int i=1;
        for (Filial filial : filiais) {
            System.out.printf("Filial %d: ", i);
            System.out.println(filial);
            i++;
        }
    }

}
