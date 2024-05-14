package semana1.resolucaoExercicios.aula2;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String codigo = "";
        int [] votos = new int[7];

        while (codigo!="shutdown") {
            System.out.println("Candidatos:\n1 - Zezinho\n" +
                    "2 - Lunguinho\n" +
                    "3 - Luizinho\n" +
                    "4 - Fernanda \n" +
                    "5 - Tio Patinhas\n" +
                    "6 - Pato Donaldo\n" +
                    "Digite o número do candidado ou 'shutdown' para encerrar o programa");

            Scanner scan = new Scanner(System.in);
            codigo = scan.next();
            scan.close();

            switch (codigo) {
                case "1":
                    votos[0] += 1;
                    break;
                case "2":
                    votos[1] += 1;
                    break;
                case "3":
                    votos[2] += 1;
                    break;
                case "4":
                    votos[3] += 1;
                    break;
                case "5":
                    votos[4] += 1;
                    break;
                case "6":
                    votos[5] += 1;
                    break;
                default:
                    votos[6] += 1;
            }
        }





    }
}
