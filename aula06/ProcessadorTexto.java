package aula06;

public class ProcessadorTexto extends AplicativoFactory{
    
    public Documento criaDocumento(String tipo){

        if(tipo.equalsIgnoreCase("relatorio")){

            return new Relatorio();

        } else if(tipo.equalsIgnoreCase("curriculo")){

            return new Curriculo();

        }
        
        return null;
        
    }

}
