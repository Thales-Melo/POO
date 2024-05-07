import java.util.Locale;

public class ValorNegativoException extends Exception {
    private Double valor;

    public Double getValor() {
        return valor;
    }
    
    public ValorNegativoException (Double valor) {

        super(String.format(Locale.US, "Nao e' possivel depositar/sacar valor negativo: %.2f.", valor));
        this.valor = valor;
    }
}
