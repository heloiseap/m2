package semana2.aula3.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paciente {

    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public List<String> historicoMedico;

    public void preencherValoresScanner(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = scanner.next();
        System.out.println("Idade: ");
        this.idade = scanner.nextInt();
        System.out.println("Altura: ");
        this.altura = scanner.nextDouble();
        System.out.println("Peso: ");
        this.peso = scanner.nextDouble();
        this.historicoMedico = new ArrayList<>();
    }

    public double calculaImc(){
        return this.peso/(this.altura*this.altura);
    }

}
