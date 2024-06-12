package repositorios;

import entidades.Consulta;
import entidades.Nutricionista;

import java.util.ArrayList;

import static repositorios.ListaNutricionistas.nutricionistas;

public class ListaConsultas {

    public static ArrayList<Consulta> consultas;

    static {
        consultas = new ArrayList<>();
    }

    public void listar(){
        for (Consulta consulta: consultas){
            System.out.println("Consulta " + consultas.indexOf(consulta) + ": \n" );
            System.out.println("Data e hora: " + consulta.dataEHora);
            System.out.println("Nutricionista: " + consulta.nomeNutricionista);
            System.out.println("Paciente: " + consulta.nomePaciente);
        }
    }

    public Consulta buscarPorId(int id){
        return consultas.get(id);
    }

    public void adicionar(Consulta consulta){
        consultas.add(consulta);
        for (Nutricionista nutricionista : nutricionistas){
            if (nutricionista.nome.equals(consulta.nomeNutricionista))
                {nutricionista.numeroDeConsultas +=1;}
        }
    }

    public void remover(int id){
        consultas.remove(id);
    }

    public void alterar(Consulta consulta){

    }

}
