package semana2.aula3;

import semana2.aula3.entidades.Paciente;

import java.util.List;

public class aula3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Paciente paciente = new Paciente();

        paciente.nome = "Joao Paciente";
        paciente.peso = 80;
        paciente.idade = 29;
        paciente.historicoMedico.addAll(
                List.of("Vacinado",
                        "Problema no joelho")
        );

    }


}
