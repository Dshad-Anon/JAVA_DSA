package LinkedList;
//QN.We have a Linked list of integers, Write a function to modify the linked list such that all even numbers 
// appear before the odd numbers in the modified linked list. Also, keep the order of even and odd numbers same.
//For eg. 8->12->10->5->4->1->6->null  is 8->12->10->4->6->5->1->null.

public class OddEvenLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    public void addFir(int data){ // It is added to last. 
        Node newNode = new Node(data);
        if(head==null ){
            head  =tail=  newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // 
    public void segregateEvenOdd(){
        Node end = head;
        Node prev = null;
        Node curr = head;
        //this while loop iterated through the list to find the last node which is done by traversing ll until condition is satisfied.
        while(end.next!=null){
           end = end.next;
        }
        Node newEnd = end; // It is set same as it will be used to maintain the end of modified list.
        //Consider the first odd nodes before getting to the even ones.
        while(curr.data%2!=0 && curr!=end){
            newEnd.next = curr; // append the odd node 'curr' to the end of the list by setting it.
            curr = curr.next;
            newEnd.next.next = null; // The next of the newlyadded Odd is set to null.
            newEnd = newEnd.next; // this updates newEnd to the point to newly added odd node.

        }

        //Do following only if there is an even node.
        if(curr.data%2==0){
            head = curr;
            // now current points to first even node.
            while(curr!=end){
                if(curr.data%2==0){
                    prev = curr;
                    curr = curr.next;
                }else{
                    // Break the link between prev and current
                    prev.next = curr.next;
  
                    /* Make next of curr as null */
                    curr.next = null;
  
                    /*Move curr to end */
                    newEnd.next = curr;
  
                    /*Make curr as new end of list */
                    newEnd = curr;
  
                    /*Update curr pointer */
                    curr = prev.next;
                }
                
            }

        }
        
        else{
            prev = curr;
        }
        if(newEnd!=end && end.data %2 != 0){
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
        }
    }
    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){
        OddEvenLL newLL = new OddEvenLL();
        newLL.addFir(8);
        newLL.addFir(12);
        newLL.addFir(10);
        newLL.addFir(5);
        newLL.addFir(4);
        newLL.addFir(1);
        newLL.addFir(6);
        newLL.printll();
        newLL.segregateEvenOdd();
        newLL.printll();
        

    }
}
