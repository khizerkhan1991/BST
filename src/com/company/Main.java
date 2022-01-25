package com.company;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(30);
        tree.insert(20);
        tree.insert(25);
        tree.insert(15);
        tree.insert(5);
        tree.insert(18);
        tree.insert(40);
        tree.insert(35);
        tree.insert(50);
        tree.insert(60);
        tree.insert(45);

        System.out.println(tree.search(15).getKey());

        System.out.println("in order traversal");
        tree.inorderTraversal();

        // for new line
        System.out.println("");
        System.out.println("pre order traversal");
        tree.preorderTraversal();

        System.out.println("");
        System.out.println("post order traversal");
        tree.postOrderTraversal();
    }
}
