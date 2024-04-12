package aula06Abstract;

public class TemaClaroFactory implements GuiFactory{

    @Override
    public Botao criarBotao() {

        return new BotaoClaro();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        
        return new CaixaTextoClaro();
    }
    
}
