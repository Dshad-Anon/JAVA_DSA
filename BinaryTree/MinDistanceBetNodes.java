package BinaryTree;

import BinaryTree.BinaryTreeB.Node;

// TO get the minimum distance betweeen nodes.
public class MinDistanceBetNodes {
    // TO calculate the minimum distance we can continue after doing LCA. The distance from lca to n1 and lca to n2 sum will be the shortest path between nodes.
    public static Node lca(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca(root.left,n1,n2);
        Node rightLca = lca(root.right, n1, n2);
        if(leftLca==null){
            return rightLca;
        }
        if(rightLca== null){
            return leftLca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root ==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int righDist = lcaDist(root.right, n);
        if(leftDist==-1 && righDist ==-1){
            return -1;
        }
        else if(leftDist==-1){
            return righDist+1;
        }
        else{
            return leftDist+1;
        }
    }
    public static int minDistanceNodes(Node root,int n1,int n2){
        Node LCA = lca(root, n1, n2);
        int dist1= lcaDist(LCA,n1);
        int dist2 = lcaDist(LCA,n2);
        return dist1+dist2;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4,n2= 5;
        System.out.println(lca(root, n1, n2).data);
        //System.out.println(minDistanceNodes(root, n1, n2));
    }
    
}
