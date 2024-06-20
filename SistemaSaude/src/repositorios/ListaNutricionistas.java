package repositorios;

import entidades.Funcionario;
import entidades.Nutricionista;
import java.util.ArrayList;

public class ListaNutricionistas {
    public static ArrayList<Nutricionista> nutricionistas;

    static {
        nutricionistas = new ArrayList<>();
    }

    public static void adicionar(Nutricionista nutricionista){
        nutricionistas.add(nutricionista);
    }


    public static void listar(){
        System.out.println("Nutricionistas: ");

        for (Nutricionista nutricionista : nutricionistas) {
            System.out.println(nutricionistas.indexOf(nutricionista) + "-" + nutricionista.nome);
        }
    }
    public Nutricionista buscarPorId(int id){
        return ListaNutricionistas.nutricionistas.get(id);
    }

    public void remover(int id){}

    public void alterar(int id){}

}
