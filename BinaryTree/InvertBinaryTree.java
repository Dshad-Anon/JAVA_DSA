package BinaryTree;

// Invert Binary Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.
public class InvertBinaryTree {
    class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    class Solution{
        Node root;
        void mirror(){
            root = mirror(root);
        }
        Node mirror(Node node){
            if(node == null){
                return node;
            }
            // DO the subtrees
            Node left = mirror(node.left);
            Node right = mirror(node.right);
            // Swap the left and right pointers
            node.left = right;
            node.right = left;

            return node;
        }
    }
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        
    }
}
