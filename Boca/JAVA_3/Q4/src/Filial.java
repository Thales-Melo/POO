import java.util.ArrayList;
import java.util.List;

public class Filial {

    private List<Double> vendas;


    public Filial () {
        this.vendas = new ArrayList<Double>();
    }    

    
    public void addVenda (double valor) {
        this.vendas.add(valor);
    }


    public double valorTotalVendas () {
        if (this.vendas.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (double venda : this.vendas) {
            total += venda;
        }
        return total;
    }
    
    
    public double valorMedioVendas () {
        if (this.vendas.isEmpty()) {
            return 0;
        }
        return this.valorTotalVendas()/this.vendas.size();
    }

    
    @Override
    public String toString () {
        return String.format("Total = R$ %.2f; Media = R$ %.2f", this.valorTotalVendas(), this.valorMedioVendas());
    }

}
