package BinaryTree;
// TO Check if Binary Tree is univalued or not.

import BinaryTree.BinaryTreeB.Node;

public class BTQUESTIONS {
    public static boolean uniValued(Node root){
        if(root == null){
            return true;
        }
        if(root.left!= null && root.data != root.left.data ){
            return false;
        }
        if(root.left!=null && root.data != root.right.data){
            return false;
        }
        return uniValued(root.left) && uniValued(root.right);
        
    }
    public static void main(String[] args) {
       Node root = new Node(2);
       root.right = new Node(2);
       root.left = new Node(2);
       root.left.left = new Node(5);
       root.left.right = new Node(2);
       if(uniValued(root)){
            System.out.println("Yes");
       }
       else{
        System.out.println("NO");
       }
    }    
}
