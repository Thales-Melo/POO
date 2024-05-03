public class Caminhao extends VeiculoAutomotor {
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
        System.out.println("caminhao iniciou");
    }


    @Override
    public void parar() {
        System.out.println("caminhao parou");
    }


    @Override
    public void buzinar() {
        System.out.println("fomfom");
    }

    // @Override
    // public String toString() {
    //     String dadosCaminhao = String.format("%.1f %d %s %s %s %s", this.getVelocMax(),
    //                                              this.getNumRodas(),
    //                                              this.getPlaca(), 
    //                                              this.getCombustivel(), 
    //                                              this.getMarca(), 
    //                                              this.getNomeDono()).replace(",", ".");
    //     System.out.println(dadosCaminhao);
    //     iniciar();
    //     System.out.println();
    //     buzinar();
    //     System.out.println();
    //     parar();
    //     return "";
    // }
}
