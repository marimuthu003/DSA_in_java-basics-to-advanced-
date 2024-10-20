package Trees;

import java.sql.SQLOutput;

public class binarytree {
    Node root;
    class Node{
        int data;
        Node left,right;

        public Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public binarytree(int d){
        root=new Node(d);
    }
    public void insertleft(Node r,int val){
        Node newnode=new Node(val);
        r.left=newnode;
    }
    public void insertright(Node r,int val){
        Node newnode=new Node(val);
        r.right=newnode;
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root) {
        if (root != null) {
            preorder(root.left);
            System.out.print(root.data+" ");
            preorder(root.right);
        }
    }
    public static void postorder(Node root) {
        if (root != null) {
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
