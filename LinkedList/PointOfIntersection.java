package LinkedList;
// In a system there are two singly linked list. By some programming error,the end node of one of the linked lists got linked to the second list, forming an inverted Y-shaped list.
// WAP to get the point where two linked lists merge.
public class PointOfIntersection {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Here comes the two loops. The outer loop is for each node of the first linked list and inner loop 2nd one is for the second list. While inner loop is running,
    // it checks that if any nodes of the current one is equal to the first ll node.If so it will return 
    // O(m*n) m&n are the length of the linked list. SC O(1)
    public Node getIntersectionPoint(Node head1,Node head2){
        while(head1!=null){
            Node temp =  head2;
            while(temp!=null){
                if(temp==head1){
                    return head1;
                }
                temp = temp.next;
            }
           head1= head1.next;
        }
        return null;
    }


    public static void main(String args[]){
        PointOfIntersection ll = new PointOfIntersection();
        Node head1;
        Node head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head1.next = newNode;
        newNode = new Node(12);
        head1.next.next = newNode;
        newNode = new Node(15);
        head2.next = newNode;
        head1.next.next.next = newNode;
        
        newNode = new Node(20);
        head2.next.next = newNode;
        head2.next.next.next = null;
        // Node intersection point
        Node intersectionPoint = ll.getIntersectionPoint(head1, head2);
        if(intersectionPoint == null){
            System.out.println("There is no intersection point in there.");
        }
        else{
            System.out.println(intersectionPoint.data);
        }
        
        
        

    }
    
}
