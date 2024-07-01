import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("João da Silva", "12345-SC", 33, "(48) 9 8765-4321", "Oncologia");
        Medico medico2 = new Medico("Rosana Rubens", "54321-SP", 45, "(11) 9 8172-3647", "Pediatria");
        Medico medico3 = new Medico("Maria João Costa", "30285-SC", 31, "(48) 9 9999-2222", "Oftalmologia");
        ListaMedicos.medicos.add(medico1);
        ListaMedicos.medicos.add(medico2);
        ListaMedicos.medicos.add(medico3);


        DevMedicoAplicacao.executar();
    }
}
