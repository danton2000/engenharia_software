package criacionais.Factory;

public abstract class AplicativoFactory {
    
    public abstract Documento criaDocumento(String tipo);

    public Documento novoDocumento(String tipo){

        Documento doc = criaDocumento(tipo);

        doc.abrirDoc();

        return doc;

    }

}
