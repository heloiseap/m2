package entidades;

import java.util.List;

public class Paciente {

    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public double pressaoArterial;
    public double frequenciaCardiaca;
    public String dietaAlimentar;
    public List<String> atividadesFisicas;

    private double calculoImc(){
        return(this.peso/(this.altura*this.altura));
    }

    private Paciente monitoramentoPaciente(Paciente paciente){
        return paciente;
    };


}
