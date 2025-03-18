package lineersearch;


public class BinarySearchTree {
    Node root;
    public Node Insert(Node node , int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        if(key > node.key ){
            node.right = Insert(node , key);
        }
        else {
            node.left = Insert(node,key);
        }
        return node;
    }
    
    
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.Insert(tree.root, 50);
    }
    
}
