import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List <ProdutoNoCarrinho> produtos_list;
    int quantidade;

    public CarrinhoDeCompras (int quant) {
        produtos_list = new ArrayList<ProdutoNoCarrinho>();
        quantidade = quant;
    }

    public void setProdutos_list(List<ProdutoNoCarrinho> produtos_list) {
        this.produtos_list = produtos_list;
    }

    public List<ProdutoNoCarrinho> getProdutos_list() {
        return produtos_list;
    }


    public void adicionar (String nome, double preco, int qtd) {
        ProdutoNoCarrinho prod = new ProdutoNoCarrinho(nome, preco, qtd);
        produtos_list.add(prod);
    }

    public void printConteudo () {
        double custoTotal = 0;
        System.out.println("No carrinho:");
        for (int i=0; i<quantidade; i++) {
            ProdutoNoCarrinho pdt = produtos_list.get(i);
            pdt.print();
            custoTotal += pdt.custoAcumulado(); 
        }

        System.out.printf("Total: R$ %.2f\n", custoTotal);
    }
}
