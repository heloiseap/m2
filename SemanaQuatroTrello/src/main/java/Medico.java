import java.util.Objects;
import java.util.Scanner;

public class Medico {

    private String nome;
    private String crm;
    private Integer idade;
    private String telefone;
    private String especialidade;

    public Medico() {
    }

    public Medico(String nome, String crm, Integer idade, String telefone, String especialidade) {

        this.nome = nome;
        this.crm = crm;
        this.idade = idade;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public static void adicionarMedico(Scanner scanner) {
        Medico medico = new Medico();

        System.out.println("*** Cadastro da pessoa médica ***");

        System.out.println("Digite o nome: ");
        medico.setNome(scanner.next());

        System.out.println("Digite o código CRM: ");
        if (!medico.checarCrm(scanner.next())) {

        } else {
            System.out.println("Digite a idade: ");
            medico.setIdade(Integer.parseInt(scanner.next()));

            System.out.println("Digite o telefone: ");
            medico.setTelefone(scanner.next());

            System.out.println("Digite a especialidade: ");
            medico.setEspecialidade(scanner.next());

            ListaMedicos.medicos.add(medico);

            System.out.println("Profissional cadastrado!");

        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {

        this.crm = crm;
    }

    public boolean checarCrm(String crm) {
        for (Medico medico : ListaMedicos.medicos) {
            if (Objects.equals(medico.getCrm(), crm)) {
                System.out.println("CRM já cadastrado! Operação cancelada");
                return false;
            }
        }
        setCrm(crm);
        return true;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
