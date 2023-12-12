# Tree Implementation with BFS and DFS

This repository contains a simple implementation of a tree data structure with breadth-first search (BFS) and depth-first search (DFS) algorithms. Additionally, it includes methods for pre-order, post-order, and in-order traversals as part of BFS, and level-order traversal as part of DFS.

## Tree Traversal Methods

- **BFS Traversals:**
  - Pre-order
  - Post-order
  - In-order

- **DFS Traversal:**
  - Level-order

## Tree Building Methods

### Populate Method
Uncomment the `populate` method to take user input for tree node values.

### BuildPreOrderTree Method
The `buildPreOrderTree` method takes an array as an argument, where "-1" represents a null node. It adds left nodes until a "-1" is encountered, effectively building a tree structure.

## Example Usage

// Uncomment the following line to take user input for tree values
 /*
     * Node root = tree.Populate(scanner);
     * System.out.println("Level-order traversal: ");
     * tree.LevelOrder(root);
     * System.out.println();
     */
// Example usage of buildPreOrderTree method
int[] treeArray = {1, 2, 3, 4, -1, 5, -1, -1, 6};
Node root = buildPreOrderTree(treeArray);
