import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArbolBinario {

    public static void main(String[] args) {
        
        int[] nodos = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};

        
        Map<Integer, List<Integer>> arbol = new HashMap<>();
        arbol.put(16, List.of(17, 18));
        arbol.put(17, List.of(19, 20));
        arbol.put(18, List.of(21, 22));
        arbol.put(21, List.of(23, 24));
        arbol.put(22, List.of(25, 26));
        arbol.put(18, List.of(27));

        System.out.println("Estructura del árbol:");
        printTree(16, arbol, 0);
    }

    private static void printTree(int nodo, Map<Integer, List<Integer>> arbol, int level) {

        String indent = "  ".repeat(level);
        System.out.println(indent + nodo);

        if (arbol.containsKey(nodo)) {
            for (int child : arbol.get(nodo)) {
                printTree(child, arbol, level + 1);
            }
        }
    }
}
