package BinarySearchTree;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            //LEft subtree
            root.left = insert(root.left, val);
        }
        if(root.data<val){
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
// Search in a BST
    public static boolean searchInBST(Node root,int key){
        if(root ==null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return searchInBST(root.left, key);
        }else{
            return searchInBST(root.right, key);
        }
    }
    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    // DELETE NODE IN JAVA
    
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        if(searchInBST(root, 6)){
            System.out.println("THe key is found.");
        }else{
            System.out.println("Key not found");
        }
    }
}
