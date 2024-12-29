import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("Elementos únicos: " + obtenerElementosUnicos(lista));
    }

    public static List<Integer> obtenerElementosUnicos(List<Integer> lista) {
        return new ArrayList<>(new HashSet<>(lista));
    }
}