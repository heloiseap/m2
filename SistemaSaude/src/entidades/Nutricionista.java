package entidades;

import java.util.ArrayList;
import java.util.Objects;

import static repositorios.ListaNutricionistas.nutricionistas;

public class Nutricionista extends Funcionario {

    public static int experiencia;
    public ArrayList<String> certificados = new ArrayList<String>();
    public int numeroDeConsultas;
    public int tempoDeExperiencia;

    static {
        experiencia = 0;
    }
    public int getTempoDeExperiencia() {
        return tempoDeExperiencia;
    }

    public void setTempoDeExperiencia() {
        this.tempoDeExperiencia += 1;
    }

    public int getNumeroDeConsultas() {
        return numeroDeConsultas;
    }

    public void setNumeroDeConsultas(int numeroDeConsultas) {
        this.numeroDeConsultas = numeroDeConsultas;
    }

    public ArrayList<String> getCertificados() {
        return certificados;
    }

    public void setCertificados(ArrayList<String> certificados) {
        this.certificados = certificados;
    }

    @Override
    public void setNome(String nome){
        for ( Nutricionista nutricionista : nutricionistas) {
            if (Objects.equals(nutricionista.nome, nome)) {
                System.out.println("Nutricionista já cadastrado(a)");
            }
            else {
                nutricionista.nome = nome;
            }
        }
    }
}
