package day10;

import java.util.Stack;

public class Node {
    public Node leftNode;
    public Node rightNode;
    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void printNode() {
        System.out.println("The node is: " + value);
    }

    @Override
    public String toString() {
        return "Node {" +
                "leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", value=" + value +
                " }";
    }
}

class Tree {
    private Node root;
    public Tree() {
        root = null;
    }

    public Node findByValue(int value) {
        Node currentNode = root;
        while (currentNode.getValue() != value) {
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeftNode();
            } else {
                currentNode = currentNode.getRightNode();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftNode();
                    if (currentNode == null) {
                        parentNode.setLeftNode(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightNode();
                    if (currentNode == null) {
                        parentNode.setRightNode(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void printTree() {
        Stack global = new Stack();
        global.push(root);
        int gaps = 32;
        boolean isRowEmpty = false;
        String sep = "-----------------------------------------------------------------";
        System.out.println(sep);
        while (!isRowEmpty) {
            Stack local = new Stack();
            isRowEmpty = true;
            for (int i = 0; i < gaps; i++) {
                System.out.println(' ');
            }
            while (global.isEmpty() == false) {
                Node temp = (Node) global.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    local.push(temp.getLeftNode());
                    local.push(temp.getRightNode());
                    if (temp.getLeftNode() != null || temp.getRightNode() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("__");
                    local.push(null);
                    local.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            gaps /= 2;
            while (local.isEmpty() == false) {
                global.push(local.pop());
            }
        }
        System.out.println(sep);
    }
}
