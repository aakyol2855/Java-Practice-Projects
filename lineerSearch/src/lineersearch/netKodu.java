package lineersearch;

class BinaryTree {
    
    Node root;
    BinaryTree() { root = null; }

    void printInorder(Node node)
    {
            if (node == null)
                    return;

            // First recur on left child
            printInorder(node.left);

            // Then print the data of node
            System.out.print(node.key + " ");

            // Now recur on right child
            printInorder(node.right);
    }

    // Driver code
    public static void main(String[] args)
    {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            // Function call
            System.out.println(
                    "Inorder traversal of binary tree is ");
            tree.printInorder(tree.root);
    }
}
