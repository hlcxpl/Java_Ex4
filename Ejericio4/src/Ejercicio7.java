import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Lista desordenada: " + desordenarLista(new ArrayList<>(lista)));
    }

    public static List<Integer> desordenarLista(List<Integer> lista) {
        Collections.shuffle(lista);
        return lista;
    }
}