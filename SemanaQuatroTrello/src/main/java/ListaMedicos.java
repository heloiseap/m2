import java.util.ArrayList;

public class ListaMedicos {

    protected static ArrayList<Medico> medicos;

    static {
        medicos = new ArrayList<>();
    }

    protected static void listar() {
        if (medicos.isEmpty()) {
            System.out.println("Não há medicos cadastrados");
        } else {
            System.out.println("Médicos cadastrados :");
            System.out.println("Nome | CRM | Idade | Telefone");
            for (Medico medico : medicos) {
                System.out.println(medico.getNome() + " | " + medico.getCrm() + " | " + medico.getIdade() + " | " + medico.getTelefone());
            }

        }
    }
}
