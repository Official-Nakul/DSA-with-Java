import java.util.*;

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

class Tree {
  private int idx = -1;

  public Node PreOrderBuildTree(int[] num) {
    idx++;
    if (num[idx] == -1) {
      return null;
    }
    Node node = new Node(num[idx]);
    node.left = PreOrderBuildTree(num);
    node.right = PreOrderBuildTree(num);
    return node;
  }

  /*--------- Breadth First Search (BFS) ----------------
    ------------------ LevelOrder -----------------------*/

  public void LevelOrder(Node node) {
    {
      Queue<Node> queue = new LinkedList<>();
      if (node == null) {
        return;
      }
      queue.add(node);
      queue.add(null);

      while (!queue.isEmpty()) {
        Node currNode = queue.remove();
        if (currNode == null) {
          System.out.println();
          if (queue.isEmpty()) {
            break;
          } else {
            queue.add(null);
          }
        } else {
          System.out.print(currNode.data + " ");
          if (currNode.left != null) {
            queue.add(currNode.left);
          }
          if (currNode.right != null) {
            queue.add(currNode.right);
          }
        }
      }
    }
  }
  /*----------- Depth First Search -------------------
   * 1) PreOrder root leftSubTree rightSubTree -------
   * 2) InOrder leftSubTree root rightSubTree --------
   * 3) PostOrder leftSubTree rightSubTree ----------- 
   --------------------------------------------------- */

  public void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder(Node node) {
    if (node == null) {
      return;
    }
    preOrder(node.left);
    System.out.print(node.data);
    preOrder(node.right);
  }

  public void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data+" ");
  }

  /*-------------- Prompting user to insert node value ---------------*/
  public Node Populate(Scanner scanner) {
    System.out.println("Enter the value of Root node: ");
    int data = scanner.nextInt();
    Node root = new Node(data);
    Populate(scanner, root);
    return root;
  }

  private void Populate(Scanner scanner, Node node) {
    System.out.println("Do you want to insert the left of " + node.data + ": ");
    boolean left = scanner.nextBoolean();
    if (left) {
      System.out.println("Enter the value of left node: ");
      int data = scanner.nextInt();
      Node leftNode = new Node(data);
      node.left = leftNode;
      Populate(scanner, leftNode);
    }
    System.out.println("Do you want to insert the right of " + node.data + ": ");
    boolean right = scanner.nextBoolean();
    if (right) {
      System.out.println("Enter the value of right node: ");
      int data = scanner.nextInt();
      Node rightNode = new Node(data);
      node.right = rightNode;
      Populate(scanner, rightNode);
    }
  }
}