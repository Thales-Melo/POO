abstract class VeiculoAutomotor implements Veiculo {
    private int numRodas;
    private String placa;
    private String combustivel;
    private float velocMax;

    public int getNumRodas() {
        return numRodas;
    }
 

    public String getPlaca() {
        return placa;
    }
    

    public String getCombustivel() {
        return combustivel;
    }


    public float getVelocMax() {
        return velocMax;
    }

    
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    
    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }


}
