package Trees;

import com.sun.source.tree.BinaryTree;

public class demo{
    public static void main(String[] args) {
        binarytree tree=new binarytree(10);
        tree.insertleft(tree.root,5);
        tree.insertright(tree.root,15);
        tree.insertleft(tree.root.left,3);
        tree.insertright(tree.root.left,8);
        tree.insertleft(tree.root.right,12);

        binarytree.preorder(tree.root);
        System.out.println();
        binarytree.inorder(tree.root);
        System.out.println();
        binarytree.postorder(tree.root);

    }


}
