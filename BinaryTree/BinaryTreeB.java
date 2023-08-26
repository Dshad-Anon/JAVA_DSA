package BinaryTree;

import java.util.*;

public class BinaryTreeB {
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BinaryTREE{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    
    public static void preOrder(Node root){
        if(root == null){
            return;
        } 
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
         if(root == null){
            return;
        } 
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
         if(root == null){
            return;
        } 
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // Level Order Traversal
    public static void levelOrder(Node root){
        if(root == null){
            return;
        } 
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        // First we put root in FIFO(i.e queue) and print it. And we go to the left and if it's  not null we add it and see right if it's not null we add it to queue.
        // TO print the next line we check if firstNode inserted is null. If yes then it is removed and after removal if it's empty then we come outside loop. If not we will add 
        // null again in the queue.
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTREE tree = new BinaryTREE();
        Node root= tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}
