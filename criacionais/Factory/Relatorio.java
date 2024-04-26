package criacionais.Factory;

public class Relatorio extends Documento{
    
    public void salvarDoc(){
        System.out.println("Salvando Relatório");
    }

    public void fecharDoc(){
        System.out.println("Fechando Relatório");
    }

    @Override
    public void abrirDoc() {
        System.out.println("Abrindo Relatório");
    }

}
