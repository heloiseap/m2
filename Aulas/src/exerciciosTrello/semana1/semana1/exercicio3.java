package exerciciosTrello.semana1.semana1;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempo, velocidade;

        System.out.println("Digite o tempo do deslocamento (segundos): ");
        tempo = scan.nextDouble();
        velocidade = 1/tempo;
        scan.close();

        System.out.println("A velocidade média é de: " + velocidade + "m/s");

    }



}
