public class Bicicleta extends VeiculoManual {
    private String marca;
    private String nomeDono;


    public String getMarca() {
        return marca;
    }


    public String getNomeDono() {
        return nomeDono;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    

    @Override
    public void iniciar() {
        System.out.println("bicicleta iniciou");
    }


    @Override
    public void parar() {
        System.out.println("bicicleta parou");
    }


    @Override
    public void buzinar() {
        System.out.println("pimpim");
    }


    // @Override
    // public String toString() {
    //     String dadosBicicleta = String.format("%.1f %d %s %s", this.getVelocMax(),
    //                                        this.getNumRodas(),
    //                                        this.getMarca(), 
    //                                        this.getNomeDono()).replace(",", ".");
    //     System.out.println(dadosBicicleta);
    //     iniciar();
    //     System.out.println();
    //     buzinar();
    //     System.out.println();
    //     parar();
    //     return "";
    // }


}
