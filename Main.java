import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Tree tree = new Tree();
    int[] num = { 10, 20, 30, -1, -1, 40, -1, -1, 50, -1, 60, 70, -1, -1, 80, -1, -1 };
    Node node = tree.PreOrderBuildTree(num);

    System.out.println("Pre-order traversal: ");
    tree.preOrder(node);
    System.out.println();

    System.out.println("In-order traversal: ");
    tree.inOrder(node);
    System.out.println();

    System.out.println("Post-order traversal: ");
    tree.postOrder(node);
    System.out.println();

    System.out.println("Level-order traversal: ");
    tree.LevelOrder(node);
    System.out.println();

    /*
     * Node root = tree.Populate(scanner);
     * System.out.println("Level-order traversal: ");
     * tree.LevelOrder(root);
     * System.out.println();
     */

    System.out.println("Number of Nodes: " + tree.CountNodes(node));
    System.out.println("Sum of Nodes data: " + tree.SumOfNodes(node));

  }

}