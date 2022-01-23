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

}
