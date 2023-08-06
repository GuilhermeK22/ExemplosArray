import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Permite chaves e valores null. Não existe garantia que os dados ficarão ordenados.
 * Para usar uma classe que implementa Map, quaisquer classes que forem utilizadas como chave
 * devem sobrescrever os métodos hashCode() e equals().
 *
*/
public class ExemploHashMap {
    public static void main(String args []) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();
    }
    private static void exemploListaSimples() {
        System.out.println("Exemplo Listas Simples");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Souza");
        lista.put(3, "Guilherme Renan");

        System.out.println(lista);
        System.out.println(" ");
    }
    private static void exemploListaSimplesIterandoValores() {
        System.out.println("Exemplo Lista Simples Iterando Valores");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Souza");
        lista.put(3, "Guilherme Renan");
        for (String value : lista.values()) {
            System.out.println(value);
        }
    }
    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("Exemplo Lista Simples Iterando Chaves");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Souza");
        lista.put(3, "Guilherme Renan");
        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }
    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("Exemplo Listas Simples Iterando Chave Valor");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Souza");
        lista.put(3, "Guilherme Renan");

        System.out.println("for comum");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }
        System.out.println("***** forEach stream *****");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("***** forEach stream 1 *****");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("***** forEach stream 2 *****");
        lista.values().stream().forEach(System.out::println);

        System.out.println("***** forEach stream 3 *****");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("***** Iterator *****");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }

    }
}
/**
 * TreeMap -> Chave nunca se repete
 * Garante que as chaves estarão em ordem ascendente.
 * Pode ser retirado do mapa por chave
 */