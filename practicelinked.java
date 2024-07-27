



public class practicelinked{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
       static Node head;
       static Node tail;
       static int size;

       public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
       newnode.next = head;
        head = newnode;
       }

       public  void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;

        }
        Node temp  = head;
    while(temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
       }

       public  void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode = tail;
       }

       public int removefirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int value = head.data;
            size =0;
            head = tail = null;
            return value;
        }
       int val = head.data;
        head = head.next;
       size--;
       return val;


       }
       public  int removelast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int value  = head.data;
            size = 0;
            head = tail = null;
            return value;
        }

        Node prev = head;
        for(int i =0;i<size -2;i++){
            prev = prev.next;

        }
      int value = prev.next.data;
      prev.next = null;
      tail = prev;
      size--;
      return value;

       }
      /*Remove nth node from end */
       public void delete(int n){
        int size = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;
            return;

        }
        int i= 1;
        int iToFind = size - n;
        Node prev = head;
        while(i< iToFind){
         prev = prev.next;
           i++;
        }
        prev.next = prev.next.next;

       }

       public  int iterativesearch(int key){
        Node temp =head;
        int i =0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
       }

       public int recurssearch(int key){
        return helper(head , key);
       }
       public int helper(Node head , int key)
       {
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return  idx + 1;
       }

       public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }
        head = prev;

       }

     public Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
     }
     public boolean palindrome(Node head){
        if(head == null && head.next == null){
            return true;
        }
        Node findmid = mid(head);

        Node prev = null;
        Node curr = findmid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left =head;
        while(right != null){
           if(left.data != right.data){
                return false;

            }
            left = left.next;
            right = right.next;
        }
        return true;


     }
       public void Middle(int idx  , int data){

        if(idx ==0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        int i =0;
        while(i < idx -1 ){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

       }

       public boolean iscycle(Node head){
        Node slow = head;
        Node fast  = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
        
       }

       public void removecycle(){
           iscycle(head);
           
        
           Node slow = head;
          Node prev = null;
        Node fast = null;
        prev = fast;
          fast = fast.next;
        prev.next = null;

       }

       public void zigzag(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }

        Node left = head;
        Node right = prev;

        Node nextleft , nextright;

        while(left != null && right != null){
            nextleft = left.next;
            left.next = right;
            nextright = right.next;
            right.next = nextleft;

            left = nextleft;
            right = nextright;
        }
       }

     
   public static void main(String[] args){
       practicelinked ll = new practicelinked();
        ll.addfirst(1);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(8);
        ll.addlast(6);
        ll.print();
        System.out.println();
        System.out.println("after zigzaging the linkedlist:");
        ll.zigzag();

    // ll.addlast(1);
    // ll.addfirst(2);
    // ll.addfirst(1);
    // ll.print();
    // System.out.println();
    // ll.Middle(2, 3);
    //      ll.print();

    // Node head = new Node(1);
    // Node temp = head;
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = temp;

    // System.out.println(ll.iscycle(head));
    // ll.removecycle();
    // System.out.println(ll.iscycle(head));
        // System.out.println(ll.palindrome(head));
        // //  System.out.println(ll.palindrome());
        //  ll.reverse();
    //      System.out.println("the key of linked list is found at :" + ll.iterativesearch(3));
    //      System.out.println("The recursive search of linked list is :" + ll.recurssearch(3));
    //      System.out.println();
    // //    ll.removefirst();
    // //    ll.removelast();
    //    ll.delete(3);
    System.out.println();

       ll.print();
   }
}