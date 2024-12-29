import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        String parentesis = "(()))()())";
        System.out.println("Parentesis validos: " + validarParentesis(parentesis));
    }

    public static boolean validarParentesis(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char c : cadena.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}