public class Carro extends VeiculoAutomotor {
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
        System.out.println("carro iniciou");
    }


    @Override
    public void parar() {
        System.out.println("carro parou");
    }


    @Override
    public void buzinar() {
        System.out.println("bibi");
    }


    // @Override
    // public String toString() {
    //     String dadosCarro = String.format("%.1f %d %s %s %s %s", this.getVelocMax(),
    //                                              this.getNumRodas(),
    //                                              this.getPlaca(), 
    //                                              this.getCombustivel(), 
    //                                              this.getMarca(), 
    //                                              this.getNomeDono()).replace(",", ".");
    //     System.out.println(dadosCarro);
    //     iniciar();
    //     System.out.println();
    //     buzinar();
    //     System.out.println();
    //     parar();
    //     return "";
    // }
}
