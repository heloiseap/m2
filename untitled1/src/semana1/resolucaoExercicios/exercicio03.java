package semana1.resolucaoExercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        /* temp de celsius pra farenhait*/

        Scanner scan = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scan.nextDouble();

        fahrenheit = (9.0/5.0) * celsius + 32;

        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
        scan.close();
    }
}
