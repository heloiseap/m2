package exerciciosTrello.semana1.semana1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double largura, comprimento, area;

        System.out.println("Digite a largura do terreno");
        largura = scan.nextDouble();

        System.out.println("Digite o comprimento do terreno");
        comprimento = scan.nextDouble();
        scan.close();

        area = largura * comprimento;
        System.out.println("A área do terreno é de " + area + "m²");

    }}