import entidades.*;
import repositorios.ListaConsultas;
import repositorios.ListaFuncionario;
import repositorios.ListaNutricionistas;
import repositorios.ListaPacientes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcao;

        //preenchimento para testes
        Paciente paciente1 = new Paciente();
        paciente1.nome = "Paciente1";
        Paciente paciente2 = new Paciente();
        paciente2.nome = "Paciente2";
        ListaPacientes.adicionar(paciente1);
        ListaPacientes.adicionar(paciente2);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Funcionario 1";
        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Funcionario 2";
        ListaFuncionario.adicionar(funcionario1);
        ListaFuncionario.adicionar(funcionario2);

        Nutricionista nutricionista1 = new Nutricionista();
        nutricionista1.nome = "Nutri 1";
        Nutricionista nutricionista2 = new Nutricionista();
        nutricionista2.nome = "Nutri 2";
        ListaNutricionistas.adicionar(nutricionista1);
        ListaNutricionistas.adicionar(nutricionista2);

        Consulta consulta1 = new Consulta();
        consulta1.dataEHora = "1/01/24 13:30";
        Consulta consulta2 = new Consulta();
        consulta2.dataEHora = "2/02/24 13:30";
        ListaConsultas.adicionar(consulta1);
        ListaConsultas.adicionar(consulta2);
        while(true){
            System.out.println("""
                Escolha uma opção:\s
                1- Cadastrar novo paciente\s
                2- Listar todos os pacientes\s
                3- Alterar informações de um paciente\s
                4- Exibir informações de pacientes\s
                5- Registrar atividade física em um paciente\s
                6- Remover paciente\s
                7- Cadastro de Funcionário\s
                8- Cadastro de endereço\s
                9- Cadastro de Nutricionista\s
                10- Criar consulta\s
                11- Listar Funcionários\s
                12- Listar Consulta\s
                13- Realizar consulta\s
                0- Sair do programa""");

            opcao = scan.next();

            switch (opcao){
                case "1":
                    cadastrarPaciente(scan);
                    continue;
                case "2":
                    listarPaciente();
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
                case "7":
                    System.out.println("Cadastro de funcionário");
                    cadastrarFuncionario(scan);
                    continue;
                case "8":
                    cadastrarEndececo(scan);
                    continue;
                case "9":
                    cadastrarNutricionista(scan);
                    continue;
                case "10":
                    criarConsulta(scan);
                    continue;
                case "11":
                    listarFuncionarios(scan);
                    continue;
                case "12":
                    listarConsultas(scan);
                    continue;
                case "13":
                    realizarConsulta(scan);
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
    static public void cadastrarPaciente(Scanner scan){
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

    static public void listarPaciente(){
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

    static public void cadastrarFuncionario(Scanner scan){
        Funcionario funcionario_novo = formularioBasico(scan);
        ListaFuncionario.adicionar(funcionario_novo);
        System.out.println("Profissional cadastrado com sucesso!");
    }

    static public Funcionario formularioBasico(Scanner scan){
        Funcionario funcionario_novo = new Funcionario();

        System.out.println("Digite o nome do profissional: ");
        funcionario_novo.nome = scan.next();

        System.out.println("Digite a idade: ");
        funcionario_novo.idade = scan.nextInt();

        System.out.println("Digite o salário: ");
        funcionario_novo.salario = Double.parseDouble(scan.next());

        funcionario_novo.endereco = cadastrarEndececo(scan);
        return funcionario_novo;
    }

    static public Endereco cadastrarEndececo(Scanner scan){
        Endereco endereco_novo = new Endereco();

        System.out.println("*** Cadastro de endeço ***");

        System.out.println("Digite o CEP: ");
        endereco_novo.cep = Integer.parseInt(scan.next());

        System.out.println("Digite a cidade: ");
        endereco_novo.cidade = scan.next();

        System.out.println("Digite a UF do funcionário: ");
        endereco_novo.estado = scan.next();

        System.out.println("Digite o nome do logradouro: ");
        endereco_novo.logradouro = scan.next();

        System.out.println("Digite o número: ");
        endereco_novo.numero = Integer.parseInt(scan.next());

        return endereco_novo;
    }

    static public void cadastrarNutricionista(Scanner scan){

        System.out.println("Cadastro de nova pessoa nutricionista: ");
        Nutricionista nutricionista_nova = new Nutricionista();

        Funcionario funcionario = formularioBasico(scan);
        nutricionista_nova.nome = funcionario.nome;
        nutricionista_nova.idade = funcionario.idade;
        nutricionista_nova.salario = funcionario.salario;
        nutricionista_nova.endereco = funcionario.endereco;

        System.out.println("Digite o número de consultas realizadas da pessoa nutricionista: ");
        nutricionista_nova.numeroDeConsultas = Integer.parseInt(scan.next());

        System.out.println("Digite o tempo de experiência da pessoa nutricionista (anos): ");
        nutricionista_nova.tempoDeExperiencia = Integer.parseInt(scan.next());


        System.out.println("Digite os certificados da pessoa nutricionista, separados por vírgula: ");
        String certificadosInput = scan.nextLine();
        List<String> certificados = Arrays.asList(certificadosInput.split(","));
        nutricionista_nova.certificados.addAll(certificados);


        ListaNutricionistas.adicionar(nutricionista_nova);


    }
    static public void criarConsulta(Scanner scan){
        System.out.println("Criação de consulta: ");

        Consulta consulta = new Consulta();
        System.out.println("Digite a data (formato dd/mm/aa) e o horário (formato hh:mm): ");
        consulta.dataEHora = scan.next();

        System.out.println("Digite o nome da pessoa nutricionista: ");
        consulta.nomeNutricionista = scan.next();

        System.out.println("Digite o nome do paciente: ");
        consulta.nomePaciente = scan.next();

        System.out.println("A consulta foi realizada? Responda com sim ou não: ");
        consulta.consultaRealizada = scan.next();

        ListaConsultas.adicionar(consulta);
    }
    static public void listarFuncionarios(Scanner scan){
        ListaFuncionario.listar();
        ListaNutricionistas.listar();
    }
    static public void listarConsultas(Scanner scan){
        ListaConsultas.listar();
    }
    static public void realizarConsulta(Scanner scan){
        System.out.println("Digite a id da consulta: ");
        int id = Integer.parseInt(scan.next());
        Consulta consulta = ListaConsultas.buscarPorId(id);

        System.out.println("A consulta foi realizada? Responda com sim ou não");
        consulta.consultaRealizada = scan.next();
    }
}
