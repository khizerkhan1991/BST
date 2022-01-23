package com.company;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(20);
        tree.insert(25);
        tree.insert(30);
        tree.insert(35);
        tree.insert(23);
        tree.insert(29);
        tree.insert(27);
        tree.insert(10);
        tree.insert(9);
        tree.insert(15);
        tree.insert(18);
        tree.insert(14);
        tree.insert(13);
        tree.insert(5);
        tree.insert(8);
        tree.insert(6);

        System.out.println(tree.search(15).getKey());


    }
}
