package criacionais.Factory;

public class Curriculo extends Documento{
    
    public void abirDoc(){
        System.out.println("Abrindo Curriculo");
    }

    public void salvarDoc(){
        System.out.println("Salvando Curriculo");
    }

    public void fecharDoc(){
        System.out.println("Fechando Curriculo");
    }

    @Override
    public void abrirDoc() {
        System.out.println("Abrindo Curriculo");
    }

}
