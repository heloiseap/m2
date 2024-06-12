package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {

    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public double pressaoArterial;
    public double frequenciaCardiaca;
    public String dietaAlimentar;
    public ArrayList<String> atividadesFisicas = new ArrayList<>();

    public Paciente() {
    }


    public double calculoImc(Paciente paciente){
        return(paciente.peso/(paciente.altura*paciente.altura));
    }

    public String monitoramentoPaciente(){
        return "** Informações do paciente **" +
                "\n Nome : " +
                this.nome +
                "\n Idade : " +
                this.idade +
                "\n Peso : " +
                this.peso +
                "\n Altura : " +
                this.altura +
                "\n Pressao Arterial : " +
                this.pressaoArterial +
                "\n Frequencia Cardiaca : " +
                this.frequenciaCardiaca +
                "\n Dieta Alimentar : " +
                this.dietaAlimentar +
                "\n Lista de atividades físicas : "+
                this.atividadesFisicas;
    }

    public static void registroAtividades(Paciente paciente, Scanner scan){

        System.out.println("Digite a atividade física: ");
        String atividade = scan.next();
        paciente.atividadesFisicas.add(atividade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    public ArrayList<String> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    public void setAtividadesFisicas(ArrayList<String> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }

    public Paciente(String nome, int idade, double peso, double altura, double pressaoArterial, double frequenciaCardiaca, String dietaAlimentar, ArrayList<String> atividadesFisicas) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterial = pressaoArterial;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.dietaAlimentar = dietaAlimentar;
        this.atividadesFisicas = atividadesFisicas;
    }


}
