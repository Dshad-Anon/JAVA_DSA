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
    public static Node delete(Node root,int val){
        if(root.data<val){
             root.right = delete(root.right, val);
        }
        else if(root.data>val){
            root.left = delete(root.left, val);
        }else{
            //1st case: leaf node deletion
            if(root.left==null &&  root.right == null){
                return null;
            }
            //Case 2- Single child node
            if(root.left == null){
                return root.right;
            }else if(root.right ==null){
                return root.left;
            }
            //Case 3: Both child node
           Node is =  findInOrderSuccessor(root.right);
           root.data = is.data;
           root.right = delete(root.right, is.data);
           
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        
        root = delete(root, 5);
        System.out.println();

        inOrder(root);
    }
}
