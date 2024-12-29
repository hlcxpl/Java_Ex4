import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Lista invertida: " + invertirLista(new ArrayList<>(lista)));
    }

    public static List<Integer> invertirLista(List<Integer> lista) {
        Collections.reverse(lista);
        return lista;
    }
}