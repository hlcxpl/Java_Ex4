import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println("Intersección: " + obtenerInterseccion(lista1, lista2));
    }

    public static List<Integer> obtenerInterseccion(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> interseccion = new ArrayList<>(lista1);
        interseccion.retainAll(lista2);
        return interseccion;
    }
}