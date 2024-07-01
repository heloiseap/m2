import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MedicoCLI {
    public void exibirMenu() {
        System.out.println("""
                ******** MENU ********\s
                1 - Adicionar\s
                2 - Listar\s
                0 - Sair\s
                """);
    }

    public Integer selecionarOpcao(Scanner scanner) {
        while (true) {

            if (scanner.hasNextLine()) {
                String inputData = scanner.nextLine();
                if (!inputData.isEmpty()) {
                    return Integer.parseInt(inputData);
                }
            }
        }

    }

}
