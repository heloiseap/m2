package exerciciosTrello.semana1.semana1;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int categoria, unidadeOrigem, unidadeDestino;
        double valor;

        System.out.println("Escolha a categoria: ");
        System.out.println("1. Comprimento");
        System.out.println("2. Peso");

        categoria = scan.nextInt();

        System.out.println("Opção: " + categoria);

        switch (categoria) {
            case 1:
                System.out.println("Escolha a unidade de origem: ");
                System.out.println("1. Metros (m)");
                System.out.println("2. Centímetros (cm)");
                System.out.println("3. Polegadas (in)");

                unidadeOrigem = scan.nextInt();

                System.out.println("Opção: " + unidadeOrigem);

                System.out.println("Escolha a unidade de destino: ");
                System.out.println("1. Metros (m)");
                System.out.println("2. Centímetros (cm)");
                System.out.println("3. Polegadas (in)");

                unidadeDestino = scan.nextInt();
                System.out.println("Opção: " + unidadeDestino);

                System.out.println("Digite o valor a ser convertido");
                valor = scan.nextDouble();
                scan.close();

                switch (unidadeOrigem) {
                    case 1:
                        switch (unidadeDestino){
                            case 1:
                                System.out.println("Resultado da conversão: " + valor + " metro(s) = " + valor + " metro(s)");
                                break;
                            case 2:
                                System.out.println("Resultado da conversão: " + valor + " metro(s) = " + valor*100 + " centímetro(s)");
                                break;
                            case 3:
                                System.out.println("Resultado da conversão: " + valor + " metro(s) = " + valor*39.37 + " polegada(s)");
                                break;
                        }
                        break;
                    case 2:
                        switch (unidadeDestino) {
                            case 1:
                                System.out.println("Resultado da conversão: " + valor + " centímetros(s) = " + valor / 100 + " metro(s)");
                                break;
                            case 2:
                                System.out.println("Resultado da conversão: " + valor + " centímetro(s) = " + valor + " centímetro(s)");
                                break;
                            case 3:
                                System.out.println("Resultado da conversão: " + valor + " centímetro(s) = " + valor * 39.37 / 100 + " polegada(s)");
                                break;
                        };
                        break;
                    case 3:
                        switch (unidadeDestino) {
                            case 1:
                                System.out.println("Resultado da conversão: " + valor + " polegada(s) = " + valor/39.37  + " metro(s)");
                                break;
                            case 2:
                                System.out.println("Resultado da conversão: " + valor + " polegada(s) = " + valor*100/38.37 + " centímetro(s)");
                                break;
                            case 3:
                                System.out.println("Resultado da conversão: " + valor + " polegada(s) = " + valor + " polegada(s)");
                                break;
                        };
                        break;
                };

                break;

            case 2:
                System.out.println("Escolha a unidade de origem: ");
                System.out.println("1. Quilogramas (kg)");
                System.out.println("2. Gramas (g)");
                System.out.println("3. Libras (lb)");

                unidadeOrigem = scan.nextInt();
                System.out.println("Opção: " + unidadeOrigem);

                System.out.println("Escolha a unidade de destino: ");
                System.out.println("1. Quilogramas (kg)");
                System.out.println("2. Gramas (g)");
                System.out.println("3. Libras (lb)");

                unidadeDestino = scan.nextInt();
                System.out.println("Opção: " + unidadeDestino);

                System.out.println("Digite o valor a ser convertido");
                valor = scan.nextDouble();
                scan.close();

                switch (unidadeOrigem){
                    case 1:
                        switch (unidadeDestino){
                            case 1:
                                System.out.println("Resultado da conversão: " + valor + " quilograma(s) = " + valor  + " quilogramas(s)");
                                break;
                            case 2:
                                System.out.println("Resultado da conversão: " + valor + " quilograma(s) = " + valor*1000  + " gramas(s)");
                                break;
                            case 3:
                                System.out.println("Resultado da conversão: " + valor + " quilograma(s) = " + valor*2.20  + " libras(s)");
                                break;
                        }
                        break;
                    case 2:
                        switch (unidadeDestino){
                            case 1:
                                System.out.println("Resultado da conversão: " + valor + " grama(s) = " + valor/1000 + " quilogramas(s)");
                                break;
                            case 2:
                                System.out.println("Resultado da conversão: " + valor + " grama(s) = " + valor  + " gramas(s)");
                                break;
                            case 3:
                                System.out.println("Resultado da conversão: " + valor + " grama(s) = " + valor*2.20/10000  + " libras(s)");
                                break;
                        }

                        break;
                    case 3:
                        switch (unidadeDestino){
                            case 1:
                                System.out.println("Resultado da conversão: " + valor + " libra(s) = " + valor/2.20 + " quilogramas(s)");
                                break;
                            case 2:
                                System.out.println("Resultado da conversão: " + valor + " libra(s) = " + valor*1000/2.20 + " gramas(s)");
                                break;
                            case 3:
                                System.out.println("Resultado da conversão: " + valor + " libra(s) = " + valor  + " libras(s)");
                                break;
                        }
                        break;
                }
                break;
        };

    };
};
