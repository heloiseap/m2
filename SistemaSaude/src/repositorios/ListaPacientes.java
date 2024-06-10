package repositorios;

import entidades.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPacientes {

    private static ArrayList<Paciente> pacientes;

    static {
        pacientes = new ArrayList<>();
    }

    public static void listar(){
        System.out.println("Pacientes cadastrados:");

        for (Paciente paciente : pacientes) {
            System.out.println(pacientes.indexOf(paciente)+ " - " + paciente.nome);
        }
    }

    public static Paciente buscarPorId(int id){
        return ListaPacientes.pacientes.get(id);
    }

    public static void adicionar(Paciente paciente){
        pacientes.add(paciente);
    }

    public static void remover(int id){
        pacientes.remove(id);
    }

    public static void alterar(int id, Scanner scan){
        Paciente paciente = pacientes.get(id);

        System.out.println("Digite o peso");
        paciente.peso = Double.parseDouble(scan.next());

        System.out.println("Digite a altura");
        paciente.altura = Double.parseDouble(scan.next());

        System.out.println("Digite a pressao arterial");
        paciente.pressaoArterial = Double.parseDouble(scan.next());

        System.out.println("Digite a freq cardiaca");
        paciente.frequenciaCardiaca = Double.parseDouble(scan.next());

        System.out.println("Digite a dieta alimentar");
        paciente.dietaAlimentar = scan.next();

        System.out.println("Paciente atualizado");
    }

}
