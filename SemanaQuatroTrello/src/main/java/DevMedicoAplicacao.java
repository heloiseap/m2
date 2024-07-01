import java.util.NoSuchElementException;
import java.util.Scanner;

public class DevMedicoAplicacao {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MedicoCLI medicoCLI = new MedicoCLI();
            medicoCLI.exibirMenu();
            int selecao = medicoCLI.selecionarOpcao(scanner);

            switch (selecao) {
                case 1:
                    adicionar(scanner);
                    continue;
                case 2:
                    listar();
                    continue;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Digite uma opção válida! ");
                    continue;
            }
            break;
        }

        scanner.close();

    }

    public static void adicionar(Scanner scanner) {
        Medico.adicionarMedico(scanner);
    }

    public static void listar() {
        ListaMedicos.listar();
    }
}
