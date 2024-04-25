public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa (String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString () {
        return String.format("%s (%d anos, %.2f metros)", this.nome, this.idade, this.altura);
    }
    

}
