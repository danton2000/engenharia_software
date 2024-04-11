package Exercicio1;
// Adicionando libs para utilizar lista no Java
import java.util.List;
import java.util.ArrayList;

public class Empresa {
    // Declarando a lista
    private List<Funcionario> listaFuncionarios;

    public Empresa() {
        listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        // percorendo a lista de obj
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(
                "Nome: " + funcionario.getNome() + 
                " -- Cargo: " + funcionario.getCargo() + 
                " -- Salário: " + funcionario.getSalario()
            );
        }
    }

    public double calcularMediaSalarial() {
        double somaSalarios = 0;
        for (Funcionario funcionario : listaFuncionarios) {
            somaSalarios += funcionario.getSalario();
        }
        return somaSalarios / listaFuncionarios.size();
    }

}
