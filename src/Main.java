import java.util.ArrayList;
public class Main {
    public static void adiconarItem(ArrayList<String> lista, String item) {
        lista.add(item);
    }

    public static void lerLista(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }

    public static void atualizarItem(ArrayList<String> lista, int indice, String novoItem) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, novoItem);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public static void removerItem(ArrayList<String> lista, String item) {
        if(lista.contains(item)) {
            lista.remove(item);
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        adiconarItem(lista, "Programação Orientada");
        adiconarItem(lista, "Banco de Dados");
        adiconarItem(lista, "Gerência de Projetos");

        System.out.println("Lista após adicionar itens:");
        lerLista(lista);
        System.out.println("---------");
        atualizarItem(lista, 0, "Programação Orientada a Objetos");

        System.out.println("Lista após atualizar item:");
        lerLista(lista);
        System.out.println("---------");

        removerItem(lista, "Banco de Dados");

        System.out.println("Lista após remover item:");
        lerLista(lista);
    }
}

