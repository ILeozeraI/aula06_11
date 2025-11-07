

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploPilha {

    public static void main(String[] args){ 
        // TODO Auto-generated methos stub

        Deque<String> pilha = new ArrayDeque<>();

        //Variável para identificar a posição do elemento na pilha
        int contador=0;

        //Adiciona elemntos no topo da pilha
        pilha.push("Prato verde");
        pilha.push("Prato azul");
        pilha.push("Prato preto");
        pilha.push("Prato branco");
        pilha.push("Prato vermelho");

        //Exibe os elementos da pilha para o topo da base
        System.out.println("Elementos da pilha(topo --> base): ");
        contador = pilha.size();

        for(String prato : pilha) {
            System.out.printf("[%d] %s%n", contador,prato);
            contador--;
        }

        //Remove o elemento do topo da pilha
        System.out.println("Retirar elemento: "+pilha.pop());

        for(String prato : pilha) {
            System.out.printf("[%d] %s%n", contador,prato);
            contador--;
        }

        //Mostra o elemento atual no topo da pilha sem remove-lo
        System.out.println("Elemento no topo da pilha: "+pilha.peek());

        //Adiciona um novo elemento no topo da pilha
        pilha.push("Prato Roxo");

        //Informa que um novo prato foi adicionado 
        System.out.println("Pilha atualizada (topo --> base): ");
        contador = pilha.size();

         for(String prato : pilha) {
            System.out.printf("[%d] %s%n", contador,prato);
            contador--;
        }

        //Verifica se a pilha contém um elemento específico 
        System.out.println("O elemento prato verde existe na pilha? "+pilha.contains("Prato verde"));
    
        //Limpa todos os elementosda pilha
        pilha.clear();

        //Verifica se a pilha está vazia 
        System.out.println("Pilha está vazia? "+pilha.isEmpty());
    }

}