/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infixpostfix;

/**
 *
 * @author Sibel
 */
class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
 
class BinarySearchTreev2 {
    Node root;
 
    // Constructor
    BinarySearchTreev2() {
        root = null;
    }
 
    // A utility function to insert
    // a new node with given key in BST
    Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(key);
            return node;
        }
 
        // Otherwise, recur down the tree
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
 
        // Return the (unchanged) node pointer
        return node;
    }
 
    // Utility function to search a key in a BST
    Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;
 
        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);
 
        // Key is smaller than root's key
        return search(root.left, key);
    }
     // Function to print inorder traversal
    public static void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
 // Function to print preorder traversal
    public static void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
      public static void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    // Driver Code
    public static void main(String[] args) {
        BinarySearchTreev2 tree = new BinarySearchTreev2();
 
        // Inserting nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
 
        // Key to be found
        int key = 6;
 
        // Searching in a BST
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
 
        key = 60;
 
        // Searching in a BST
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
         // Function call
        System.out.println("Inorder traversal of binary tree is: ");
        
        printInorder(tree.root);
         System.out.println("\nPreorder traversal of binary tree is: ");
        printPreorder(tree.root);
         System.out.println("\nPostorder traversal of binary tree is: ");
        printPostorder(tree.root);
    }
}