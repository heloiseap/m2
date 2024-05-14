package exerciciosTrello.semana1.semana1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double [] calorias = new double[7];
        boolean [] consumoAlto = new boolean[7];
        double soma=0, media=0;

        for (int i=0;i<7; i++) {
            System.out.println("Digite a quantidade de calorias do " + (i+1) + " dia");
            calorias[i] = scan.nextDouble();
            soma += calorias[i];
            if (calorias[i]>2000){
                consumoAlto[i] = true;
            } else {
                consumoAlto[i] = false;
            }
        }
        media = soma/7;

        scan.close();
        System.out.println("O total de calorias consumidas na semana foi de "+ soma +" calorias");
        System.out.println("A média diária foi de " + media);
        System.out.println("Consumo de calorias alto: ");
        for (int k=0;k<7;k++){
            if (consumoAlto[k] == true) {
                System.out.println((k+1) +"º dia da semana");
            }

        }
    }
}
