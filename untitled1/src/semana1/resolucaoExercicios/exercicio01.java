package semana1.resolucaoExercicios;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        /* calculo imc com input de peso (kg) e altura (m) */

        Scanner scan = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Digite seu peso (em kg): ");
        peso = scan.nextDouble();

        System.out.print("Digite sua altura (em m): ");
        altura = scan.nextDouble();

        imc = peso / (altura*altura);

    }
}
