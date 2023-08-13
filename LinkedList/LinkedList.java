package LinkedList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    public void addFirst(int data){
        // Step 1 = Create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        

        //Step2 = newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next ;
        temp.next = newNode;
    }

    // Remove the first.
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        //Previous index: i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search for a key in a Linked list: Return the position where it is found. If not return , -1.  // Iterative way 
    public int findPosition(int key){
        int idx=0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                 return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // TO find position using recursive search.
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        // here while index is being backtracked the head will be shifted ahead so it will be +1.
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node previous = null;
        Node current = tail = head; // tail will be in the first so it will be equal to head. See right to left for assignment of values.
        Node next;
        while(current !=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        head = previous;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        if(n == size){
            head = head.next; // remove First
            return;
        }
        // size-n
        int i=1;
        int iToFind = size-n;
        Node previous = head;
        while(i<iToFind){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return;
    }

    //Linked list palindrome
    // slow and fast approach to find the mid val of LL.
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next !=null){
            slow = slow.next; // +1
            fast = fast.next.next; //+2
        } 
        return slow; // show is midNode everytime if LL is even or odd.
    }

    public boolean isPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
        //Step1 find the mid
        Node midNode = findMid(head);
        // step 2 reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  // right half head
        Node left = head;

        // step 3 check left half and right half
        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
       // ll.addLast(1);
        System.out.println(ll.isPalindrome());
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.recSearch(4));
        // System.out.println(ll.findPosition(10));
    //     ll.print();
    //    // System.out.println(size);
    //    ll.removeFirst();
    //    ll.print();

    //    ll.removeLast();
    //    ll.print();
    //    System.out.println(size);
    }
}
