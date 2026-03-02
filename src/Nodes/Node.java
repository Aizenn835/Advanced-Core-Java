package Nodes;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){this.data = data;}


    public static int sumValues(Node root){
        if(root == null){
            return 0;
        }
        return (root.data + sumValues(root.left) + sumValues(root.right));
    }
}
