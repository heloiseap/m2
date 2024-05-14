package semana1.resolucaoExercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, fcm;

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        fcm = 220 - idade;

        System.out.println("Sua frequencia cardiaca máxima é: " + fcm + "bpm");
        scan.close();
    }
}
