package com.vincentmegia;

public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    public void add(int value) {
        if (value < this.value) {
            if (this.leftNode != null)
                this.leftNode.add(value);
            else
                this.leftNode = new Node(value);
        }
        else {
            if (this.rightNode != null)
                this.rightNode.add(value);
            else
                this.rightNode = new Node(value);
        }
    }

    /**
     * Node, Left, Right
     * @return
     */
    public String preOrderPrint() {
        //Print node
        //Print left
        //Print right
        String text = String.valueOf(this.value);
        System.out.println(this.value);
        if (this.leftNode != null) //recurse left
            text += this.leftNode.preOrderPrint();
        if (this.rightNode != null)
            text += this.rightNode.preOrderPrint();
        return text;
    }

    /**
     * Left, Node, Right
     * @return
     */
    public String inOrderPrint() {
        var text = "";
        if (this.leftNode != null)
            text += this.leftNode.inOrderPrint();
        text += this.value;
        if (this.rightNode != null)
            text += this.rightNode.inOrderPrint();
        return text;
    }

    /**
     * Left, Right, Node
     * @return
     */
    public String postOrderPrint() {
        var text = "";
        if (this.leftNode != null)
            text += this.leftNode.postOrderPrint();
        if (this.rightNode != null)
            text += this.rightNode.postOrderPrint();
        text += this.value;
        return text;
    }

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

    public Node(int value) {
        this.value = value;
    }
}
