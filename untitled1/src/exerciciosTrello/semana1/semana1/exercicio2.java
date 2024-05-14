package exerciciosTrello.semana1.semana1;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, salarioMinimo = 1412.00;

        System.out.println("Digite seu salário: ");
        salario = scan.nextDouble();
        scan.close();

        System.out.printf("Você recebe %.2f salário(s) mínimo(s)", salario/salarioMinimo);

    }

}
