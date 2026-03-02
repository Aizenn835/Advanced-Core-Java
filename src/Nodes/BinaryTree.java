package Nodes;

import static Nodes.Node.sumValues;

public class BinaryTree {
    public static void main(String[] args) {

        //Create nodes:
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // connect nodes;

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        // print values
        System.out.println("Sum of all values: " + sumValues(node1));
    }
}
