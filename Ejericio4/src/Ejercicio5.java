import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        System.out.println("Cadena invertida: " + invertirCadena(cadena));
    }

    public static String invertirCadena(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char c : cadena.toCharArray()) {
            pila.push(c);
        }
        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()) {
            invertida.append(pila.pop());
        }
        return invertida.toString();
    }
}
