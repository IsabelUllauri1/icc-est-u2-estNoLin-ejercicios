package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

       int[] values = {4, 2, 7, 1, 3, 6, 9};

        InsertBST insertador = new InsertBST();
        Node root = null;
        for (int v : values) {
            root = insertador.insert(root, v);
        }
        System.out.print("\nInOrder del árbol original: ");
        insertador.printInOrder(root);

        InvertBinaryTree inverter = new InvertBinaryTree();
        root = inverter.invertTree(root);
        System.out.print("\nInOrder del árbol invertido: ");
        inverter.printInOrder(root);

        ListLevels lister = new ListLevels();
        List<List<Node>> levels = lister.listLevels(root);
        System.out.println("\nNiveles del árbol:");
        for (List<Node> level : levels) {
            System.out.println(level.stream().map(n -> String.valueOf(n.getValue())).reduce((a, b) -> a + " -> " + b).orElse(""));
        }

        Depth depthCalc = new Depth();
        int depth = depthCalc.maxDepth(root);
        System.out.println("\nProfundidad máxima del árbol: " + depth);
        System.out.print("InOrder final: ");
        depthCalc.printInOrder(root);
    }
    
}
