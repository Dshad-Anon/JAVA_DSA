package LinkedList;
// QN: We have a ll and two integers M and N. Traverse the ll such that you retain M nodes then delete next N node, continue the same till end of the ll. 

public class DeletenList {
    public static class Node{
        int data;
        Node next = null;
        public Node(){
          
        }
        public static Node head;
        public static Node tail;

        static Node push(Node head_ref ,int newData){
            Node newNode = new Node();
            newNode.data = newData;
            newNode.next = (head_ref);
            (head_ref) = newNode;
            return head_ref;
        }
        // Helper function to print a given ll.
        public static void print(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void skipMdelN(Node head,int m,int n){
            Node curr = head;
            Node t;
            int count;
            while(curr!=null){
                for(count=1;count<m && curr!=null;count++){
                    curr = curr.next;
                }
                if(curr==null){
                    return;
                }
                t = curr.next;
                for(count=1;count<=n&&t!=null;count++){
                    t= t.next;
                }
                curr.next = t;
                curr = t;
            }
        }

        
        public static void main(String args[]){
            Node head = null;
            int M=2,N=3;
            head = push(head,10);
            head = push(head,9);            
            head = push(head,8);
            head = push(head,7);
            head = push(head,6);
            head = push(head,5);
            head = push(head,4);
            head = push(head,3);
            head = push(head,2);
            head = push(head,1);
            print(head);
            skipMdelN(head, M, N);
            System.out.println("Linked list after deletion.");
            print(head);
            
        }
    }
}
