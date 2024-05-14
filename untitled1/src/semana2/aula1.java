package semana2;

import java.util.LinkedList;

public class aula1 {

    public static void main(String[] args) {
        LinkedList<String> pilha = new LinkedList<>();
        pilha.addLast("item1");
        pilha.addLast("item2");
        pilha.addLast("item3");
        pilha.addLast("item4");
        int tamanhoPilha = pilha.size();
        for (int i = 0; i < tamanhoPilha; i++) {
            System.out.println(pilha.pollLast());

        }

    }
}
