package estruturais.Bridge;

public class Titular {

    private String cpf;

    private String nome;

    public String getCpf() {
        return cpf;
    }

    public Titular(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
