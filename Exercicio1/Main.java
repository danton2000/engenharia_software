package Exercicio1;

public class Main {
    public static void main(String[] args){

        Empresa getnet = new Empresa();

        Funcionario functionario_1 = new Funcionario();
        functionario_1.setNome("Danton Rodrigues");
        functionario_1.setIdade(23);
        functionario_1.setSalario(4000.0);
        functionario_1.setCargo("Analista");

        Funcionario functionario_2 = new Funcionario();
        functionario_2.setNome("Carlos Almeida");
        functionario_2.setIdade(25);
        functionario_2.setSalario(5000.0);
        functionario_2.setCargo("Supervisor");

        getnet.adicionarFuncionario(functionario_1);
        getnet.adicionarFuncionario(functionario_2);

        getnet.listarFuncionarios();

        System.out.println("Média Salarial dos Funcionários: " + getnet.calcularMediaSalarial());
    }
}
