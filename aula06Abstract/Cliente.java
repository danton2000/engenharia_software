package aula06Abstract;

public class Cliente {
    
    private Botao botao;

    private CaixaTexto caixaTexto;

    // metodo construtor
    public Cliente(GuiFactory factory){

        botao = factory.criarBotao();

        caixaTexto = factory.criarCaixaTexto();

    }

    public void construirTela(){

        botao.exibir();;

        caixaTexto.renderizar();

    }

}
