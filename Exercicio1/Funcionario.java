package Exercicio1;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Double salario;
    private String cargo;

    // Getter e Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){

        return this.nome;

    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getIdade(){

        return this.idade;

    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public Double getSalario(){

        return this.salario;

    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo(){

        return this.cargo;

    }

}
