package BinaryTree;
// To calculate the height of binary tree count the root to in depth node numbers.

public class HeightBT {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    /*
              1
             / \
            2   3
           / \ / \
          4  5 6  7

    */
    public static int height(Node root){ // TO caculate the height of the tree.
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int count(Node root){ // TO caculate the total number of the NOdes in a tree
        if(root == null){
            return 0;
        }
        int leftcount = count(root.left); // Left counts all the left part of the root.
        int rightcount = count(root.right); // Right of the root will be counted by this recursion function
        return leftcount+rightcount+1;   // Here the root is also added.
    }

    public static int totalSum(Node root){ // TO caculate the total sum of the NOdes in a tree
        if(root == null){
            return 0;
        }
        int leftSum = totalSum(root.left); // Left counts all the left part of the root.
        int rightSum = totalSum(root.right); // Right of the root will be counted by this recursion function
        return leftSum+rightSum+root.data;   // Here the root is also added.
    }


    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(totalSum(root));
    }    
}
