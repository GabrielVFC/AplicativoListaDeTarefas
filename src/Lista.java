import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        Scanner dado = new Scanner(System.in);
        int opcao = -1;
        do {
            String msg = """
                    == Aplicativo de Lista de Tarefas ==
                    1. Adicionar tarefa
                    2. Remover tarefa
                    3. Listar tarefas
                    4. Sair
                    """;
            System.out.println(msg);
            System.out.println("Escolha uma opção:");
            opcao = dado.nextInt();
            dado.nextLine();

            switch (opcao){
                case 1:
                    System.out.printf("Digite a tarefa a ser adicionada: ");
                    String tarefa = dado.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.printf("Deseja remover qual tarefa?");
                    int removerTarefa = dado.nextInt();
                    tarefas.remove(removerTarefa);
                    System.out.println("Tarefa removida!");
                    break;
                case 3:
                    System.out.println("Esses são os itens da lista: %s".formatted(tarefas));
                    int i = 0;
                    for (String lista : tarefas){
                        System.out.printf("Posição %d- %s \n",i, lista);
                        i++;
                    }
                    break;

                case 4:
                    System.out.println("Você saiu!");
            }
        } while (opcao != 4);
    }
}
