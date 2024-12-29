import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = crearListaAleatoria(10);
        System.out.println("Lista aleatoria: " + lista);
    }

    public static List<Integer> crearListaAleatoria(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(100)); // Números aleatorios entre 0 y 99
        }
        return lista;
    }
}