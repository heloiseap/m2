package repositorios;

import entidades.Funcionario;

import java.util.ArrayList;

public class ListaFuncionario {
    public static ArrayList<Funcionario> funcionarios;

    static {
        funcionarios = new ArrayList<>();
    }

    public void listar(){}

    public Funcionario buscarPorId(int id){
        return ListaFuncionario.funcionarios.get(id);
    }

    public void adicionar(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void remover(int id){}

    public void alterar(int id){}

}
