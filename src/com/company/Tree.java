package com.company;

public class Tree {

    private Node node;
    public boolean insert(Integer key){

        if(node == null){
            node = new Node(key);
            return true;
        }

        return insert(node, key);
    }

    public boolean insert(Node mainNode, int key){

        if(key <= mainNode.getKey()){
            if(mainNode.getLeftNode() == null){
                mainNode.setLeftNode(new Node(key));
                return true;
            }
            else
                return insert(mainNode.getLeftNode(), key);
        }
        else
            if (mainNode.getRightNode() ==  null){
                mainNode.setRightNode(new Node(key));
                return true;
            }
            else
                return insert(mainNode.getRightNode(), key);
        }

    public Node search(Integer key){
        return search(node, key);
    }
    public Node search(Node mainNode, Integer key){

        if (mainNode.getKey() == key)
            return mainNode;

        return key <= mainNode.getKey() ? search(mainNode.getLeftNode(), key) : search(mainNode.getRightNode(), key);
    }


    public void inorderTraversal(){inorderTraversal(node); }

    private void inorderTraversal(Node node) {

        if(node.getLeftNode() != null)
            inorderTraversal(node.getLeftNode());

        System.out.print(node.getKey() + ", ");

        if(node.getRightNode() != null)
            inorderTraversal(node.getRightNode());
    }

    public void preorderTraversal(){
        preorderTraversal(node);
    }

    private void preorderTraversal(Node node) {

        System.out.print(node.getKey() + ", ");

        if(node.getLeftNode() != null)
            preorderTraversal(node.getLeftNode());
        if(node.getRightNode() != null)
            preorderTraversal(node.getRightNode());
    }


    public void postOrderTraversal(){
        postOrderTraversal(node);
    }

    private void postOrderTraversal(Node node) {

        if(node.getLeftNode() != null)
            postOrderTraversal(node.getLeftNode());
        if(node.getRightNode() != null)
            postOrderTraversal(node.getRightNode());

        System.out.print(node.getKey() + ", ");
    }

}
