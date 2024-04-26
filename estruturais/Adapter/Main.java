package estruturais.Adapter;

public class Main {
    
    public static void main(String[] args) {
        
        PinoRedondo pino = new PinoRedondo();

        pino.setRaio(5.0);

        ConexaoRedonda conexao = new ConexaoRedonda();

        conexao.setRaio(5.0);

        if(conexao.verificaConexao(pino)) {

            System.out.println("Foi possivel conectar o pino redondo");

        }

        PinoPlano pinoPlanoPequeno = new PinoPlano();

        PinoPlano pinoPlanoGrande = new PinoPlano();

        pinoPlanoPequeno.setLargura(9.0);

        pinoPlanoGrande.setLargura(12.0);

        PinoPlanoAdapter adapter = new PinoPlanoAdapter(pinoPlanoPequeno);

        adapter.setRaio(pinoPlanoPequeno.getLargura() / 2);

        System.out.println(adapter.getRaio());

        if(conexao.verificaConexao(adapter)){

            System.out.println("Foi possivel conectar o pino plano pequeno na conexão redonda");

        }

        PinoPlanoAdapter adapterPinoMaior = new PinoPlanoAdapter(pinoPlanoGrande);
        
        if(conexao.verificaConexao(adapterPinoMaior)){

            System.out.println("Foi possivel conectar o pino plano maior na conexão redonda");

        }
    }

}
