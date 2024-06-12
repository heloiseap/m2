package repositorios;

import entidades.Funcionario;
import entidades.Nutricionista;
import java.util.ArrayList;

public class ListaNutricionistas {
    public static ArrayList<Nutricionista> nutricionistas;

    static {
        nutricionistas = new ArrayList<>();
    }

    private void adicionar(Nutricionista nutricionista){
        nutricionistas.add(nutricionista);
    }


    public void listar(){}

    public Nutricionista buscarPorId(int id){
        return ListaNutricionistas.nutricionistas.get(id);
    }

    public void remover(int id){}

    public void alterar(int id){}

}
