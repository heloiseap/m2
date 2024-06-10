package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {

    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public double pressaoArterial;
    public double frequenciaCardiaca;
    public String dietaAlimentar;
    public ArrayList<String> atividadesFisicas = new ArrayList<>();

    public Paciente() {
    }


    public double calculoImc(Paciente paciente){
        return(paciente.peso/(paciente.altura*paciente.altura));
    }

    public String monitoramentoPaciente(){
        return "** Informações do paciente **" +
                "\n Nome : " +
                this.nome +
                "\n Idade : " +
                this.idade +
                "\n Peso : " +
                this.peso +
                "\n Altura : " +
                this.altura +
                "\n Pressao Arterial : " +
                this.pressaoArterial +
                "\n Frequencia Cardiaca : " +
                this.frequenciaCardiaca +
                "\n Dieta Alimentar : " +
                this.dietaAlimentar +
                "\n Lista de atividades físicas : "+
                this.atividadesFisicas;
    }

    public static void registroAtividades(Paciente paciente, Scanner scan){

        System.out.println("Digite a atividade física: ");
        String atividade = scan.next();
        paciente.atividadesFisicas.add(atividade);
    }

}
