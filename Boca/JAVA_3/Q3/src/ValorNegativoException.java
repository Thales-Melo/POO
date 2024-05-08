import java.util.Locale;

public class ValorNegativoException extends Exception {
    private static final Locale br = new Locale("pt", "BR");

    public ValorNegativoException (Double valor) {
        super(String.format(br, "Nao eh possivel depositar/sacar valor negativo: %.1f.", valor));
    }
}
