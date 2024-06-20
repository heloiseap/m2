package repositorios;

import entidades.Funcionario;
import entidades.Paciente;

import java.util.ArrayList;

public class ListaFuncionario {
    public static ArrayList<Funcionario> funcionarios;

    static {
        funcionarios = new ArrayList<>();
    }

    public static void listar(){
        System.out.println("Funcionários cadastrados: ");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionarios.indexOf(funcionario) + "-" + funcionario.nome);
        }
    }

    public Funcionario buscarPorId(int id){
        return ListaFuncionario.funcionarios.get(id);
    }

    public static void adicionar(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void remover(int id){}

    public void alterar(int id){}

}
