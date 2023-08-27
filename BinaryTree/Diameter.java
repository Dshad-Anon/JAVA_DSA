package BinaryTree;
// TO find the diameter of a tree.
public class Diameter {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;

    }
    public static int diameter(Node root){  // O(N^2)
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt+rightHt+1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info infodiameter(Node root){  //O(n)
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = infodiameter(root.left);
        Info rightInfo = infodiameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static void main(String args[]){
        /*
              1
             / \
            2   3
           / \ / \
          4  5 6  7

    */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //System.out.println(diameter(root));
        System.out.println(infodiameter(root).diam);
        System.out.println(infodiameter(root).ht);
    }
}
