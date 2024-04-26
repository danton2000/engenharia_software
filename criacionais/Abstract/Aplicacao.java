package criacionais.Abstract;

public class Aplicacao {
    
    public static void main(String[] args){

        GuiFactory factory = new TemaClaroFactory();

        Cliente cli = new Cliente(factory);

        cli.construirTela();

        factory = new TemaEscuroFactory();

        cli = new Cliente(factory);

        cli.construirTela();

    }

}
