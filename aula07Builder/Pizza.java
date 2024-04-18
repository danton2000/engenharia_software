public class Pizza {
    
    private String massa;

    private String molho;

    private String cobertura;

    private String borda;

    public String toString(){
        
        String result = "Pizza com massa: '" + massa +
        ", molho: '" + molho +
        ", cobertura: '" + cobertura +
        ", borda: '" + borda;

        return result;
    }

    public String getMassa() {

        return massa;

    }

    public void setMassa(String massa) {

        this.massa = massa;

    }

    public String getMolho() {

        return molho;

    }

    public void setMolho(String molho) {

        this.molho = molho;

    }

    public String getCobertura() {

        return cobertura;

    }

    public void setCobertura(String cobertura) {

        this.cobertura = cobertura;

    }

    public String getBorda() {

        return borda;

    }

    public void setBorda(String borda) {

        this.borda = borda;

    }

}
