package datastr2;

import java.util.HashMap;

class Node {
    char key;
    HashMap<String, Integer> names;
    HashMap<Character, Node> children;

    public Node(char item) {
        key = item;
        names = new HashMap<>();
        children = new HashMap<>();
    }
}

class NameTree {
    Node root;

    // Constructor
    NameTree() {
        root = new Node(' ');
    }

    // Utility method to insert a name into the tree
    void insert(String name) {
        if (name == null || name.isEmpty()) {
            return;
        }

        Node current = root;
        StringBuilder prefix = new StringBuilder();

        for (char c : name.toCharArray()) {
            prefix.append(c);

            if (!current.children.containsKey(c)) {
                current.children.put(c, new Node(c));
            }

            current = current.children.get(c);

            // Update the count of names represented by the current node
            current.names.putIfAbsent(prefix.toString(), 0);
            current.names.put(prefix.toString(), current.names.get(prefix.toString()) + 1);
        }
    }

    // Utility method to update a name in the tree
    void update(String oldName, String newName) {
        delete(oldName);
        insert(newName);
    }

    // Utility method to delete a name from the tree
    void delete(String name) {
        if (name == null || name.isEmpty()) {
            return;
        }

        Node current = root;
        StringBuilder prefix = new StringBuilder();

        for (char c : name.toCharArray()) {
            prefix.append(c);

            if (!current.children.containsKey(c)) {
                return; // The name does not exist in the tree
            }

            current = current.children.get(c);

            // Update the count of names represented by the current node
            current.names.put(prefix.toString(), current.names.get(prefix.toString()) - 1);
        }
    }

    // Utility method to search for a name in the tree
    boolean search(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }

        Node current = root;

        for (char c : name.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false; // The name does not exist in the tree
            }

            current = current.children.get(c);
        }

        return true;
    }

    // Utility method to get the count of names represented by a node
    int getCount(Node node, String prefix) {
        if (node == null) {
            return 0;
        }

        return node.names.getOrDefault(prefix, 0);
    }

    // Driver Code
    public static void main(String[] args) {
        NameTree tree = new NameTree();

        // Inserting names
        tree.insert("Ali");
        tree.insert("Ayşe");
        tree.insert("İrfan");
        tree.insert("Alihan");
        tree.insert("Alican");

        // Updating a name
        tree.update("Alihan", "Veli");

        // Searching for names
        System.out.println(tree.search("Ali")); // Output: true
        System.out.println(tree.search("Veli")); // Output: true
        System.out.println(tree.search("Ahmet")); // Output: false
    }
}