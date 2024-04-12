package aula06Factory;

public abstract class Documento {
    
    public abstract void abrirDoc();

    public abstract void salvarDoc();

    public void fecharDoc() {
        System.out.println("Fechar na classe pai!! YAY!");
    }

}
