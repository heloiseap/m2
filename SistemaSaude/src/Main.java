import entidades.Paciente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n" +
                "1- Cadastrar novo paciente \n" +
                "2- Listar todos os pacientes \n" +
                "3- Alterar informações de um paciente \n" +
                "4- Exibir informações de pacientes \n" +
                "5- Registrar atividade física em um paciente \n" +
                "6- Remover paciente");
        String opcao = scan.next();
        scan.close();

        switch (opcao){
            case '1':
                cadastrar();
                break;
            case '2':
                listar();
                break;
            case '3':
                editarPaciente();
                break;
            case '4':
                exibirPaciente();
                break;
            case '5':
                registrarAtividadeFisica();
                break;
            case '6':
                removerPaciente();
                break;
        }

    }
    public void cadastrar(){
        Scanner scan = new Scanner();
        System.out.println("Cadastro de novo paciente");
        Paciente paciente_novo = new Paciente();

        System.out.println("Digite o nome do paciente: ");
        paciente_novo.nome = scan.next();

        System.out.println("Digite a idade do paciente: ");
        paciente_novo.idade = scan.nextInt();

        System.out.println("Digite o peso do paciente: ");
        paciente_novo.peso = scan.nextDouble();

        System.out.println("Digite a altura do paciente: ");
        paciente_novo.altura = scan.nextDouble();

        System.out.println("Digite a pressão aterial do paciente: ");
        paciente_novo.pressaoArterial = scan.nextDouble();

        System.out.println("Digite a frequencia cardíaca do paciente: ");
        paciente_novo.frequenciaCardiaca = scan.nextDouble();

        System.out.println("Digite a dieta alimentar do paciente: ");
        paciente_novo.dietaAlimentar = scan.next();

        System.out.println("Digite as atividades físicas que o paciente realiza: ");
        //paciente_novo.atividadesFisicas = scan.nex;

        scan.close();





    };
    public void listar(){};
    public void editarPaciente(){};
    public void exibirPaciente(){};
    public void registrarAtividadeFisica(){};
    public void removerPaciente(){};

}
