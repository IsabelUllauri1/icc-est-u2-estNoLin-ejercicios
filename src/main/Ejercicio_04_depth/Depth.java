package main.Ejercicio_04_depth;
import main.Materia.Models.Node;


public class Depth {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }
    public void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.getLeft());
            System.out.print(root.getValue() + ", ");
            printInOrder(root.getRight());
        }
    }
}
