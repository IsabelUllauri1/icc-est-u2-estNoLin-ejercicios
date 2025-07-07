package main.Ejercicio_03_listLeves;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                level.add(current);
                if (current.getLeft() != null) queue.offer(current.getLeft());
                if (current.getRight() != null) queue.offer(current.getRight());
            }
            result.add(level);
        }
        return result;
    }
    public void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.getLeft());
            System.out.print(root.getValue() + ", ");
            printInOrder(root.getRight());
        }
    }   
}
