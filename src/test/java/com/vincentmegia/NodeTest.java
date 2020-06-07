package com.vincentmegia;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    /**
     * Node, Left, Right travel
     */
    public void preOrderTraversal() {
        var output = "107618911201422";
        var node = new Node(10);
        node.add(7);
        node.add(11);
        node.add(6);;
        node.add(8);
        node.add(1);
        node.add(9);
        node.add(20);
        node.add(14);
        node.add(22);

        var text = node.preOrderPrint();
        assertEquals(output, text);
    }

    @Test
    /**
     * Left, Node, Right travel
     */
    public void inOrderTraversal() {
        var output = "167891011142022";
        var node = new Node(10);
        node.add(7);
        node.add(11);
        node.add(6);;
        node.add(8);
        node.add(1);
        node.add(9);
        node.add(20);
        node.add(14);
        node.add(22);

        var text = node.inOrderPrint();
        assertEquals(output, text);
    }

    @Test
    /**
     * Left, Node, Right travel
     */
    public void postOrderTraversal() {
        var output = "169871422201110";
        var node = new Node(10);
        node.add(7);
        node.add(11);
        node.add(6);;
        node.add(8);
        node.add(1);
        node.add(9);
        node.add(20);
        node.add(14);
        node.add(22);

        var text = node.postOrderPrint();
        assertEquals(output, text);
    }
}
