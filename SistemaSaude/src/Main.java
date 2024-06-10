import repositorios.ListaPacientes;
import entidades.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcao;

        Paciente paciente1 = new Paciente();
        paciente1.nome = "Paciente1";
        Paciente paciente2 = new Paciente();
        paciente2.nome = "Paciente2";
        ListaPacientes.adicionar(paciente1);
        ListaPacientes.adicionar(paciente2);

        while(true){
            System.out.println("""
                Escolha uma opção:\s
                1- Cadastrar novo paciente\s
                2- Listar todos os pacientes\s
                3- Alterar informações de um paciente\s
                4- Exibir informações de pacientes\s
                5- Registrar atividade física em um paciente\s
                6- Remover paciente\s
                0- Sair do programa""");

            opcao = scan.next();


            switch (opcao){
                case "1":
                    cadastrar(scan);
                    continue;
                case "2":
                    listar();
                    continue;
                case "3":
                    editarPaciente(scan);
                    continue;
                case "4":
                    exibirPaciente(scan);
                    continue;
                case "5":
                    registrarAtividadeFisica(scan);
                    continue;
                case "6":
                    removerPaciente(scan);
                    continue;
                case "0":
                    break;
                default:
                    //System.out.println("Opção inválida!\n"); - é acionado mesmo fora do menu principal
                    continue;
            }
            break;
        }

        scan.close();

    }
    static public void cadastrar(Scanner scan){
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

        System.out.println("Digite as atividades físicas que o paciente realiza, separadas por vírgula: ");
        List<String> atividades = List.of(scan.next().split(","));
        paciente_novo.atividadesFisicas.addAll(atividades);

        ListaPacientes.adicionar(paciente_novo);
        System.out.println("Paciente cadastrado com sucesso!");


    }

    static public void listar(){
        ListaPacientes.listar();
    }
    static public void editarPaciente(Scanner scan){
        System.out.println("Digite a id do paciente: ");
        String id = scan.next();
        ListaPacientes.alterar(Integer.parseInt(id),scan);
    }
    static public void exibirPaciente(Scanner scan){
        System.out.println("Digite a id do paciente: ");
        int id = Integer.parseInt(scan.next());
        Paciente paciente = ListaPacientes.buscarPorId(id);
        System.out.println(paciente.monitoramentoPaciente());
    }
    static public void registrarAtividadeFisica(Scanner scan){
        System.out.println("Digite a id do paciente: ");
        int id = Integer.parseInt(scan.next());
        Paciente paciente = ListaPacientes.buscarPorId(id);
        paciente.registroAtividades(paciente,scan);
    }

    static public void removerPaciente(Scanner scan){
        System.out.println("Digite a id do paciente: ");
        int id = Integer.parseInt(scan.next());
        ListaPacientes.remover(id);
    }

}
