package criacionais.Factory;

public class Main {
    
    public static void main(String[] args){

        ProcessadorTexto word = new ProcessadorTexto();

        Documento relatorio = word.novoDocumento("relatorio");

        Documento curriculo = word.novoDocumento("curriculo");

        relatorio.salvarDoc();

        curriculo.salvarDoc();


    }

}
