
public class Linkedlist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    static int size;

    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = null;
            return;

        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    /*Delelte Nth node from the last Nth node */
    public void deletenthNode(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (size == n) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;

    }

    public int iterativesearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    /*Recursive search */
    public int recsearch(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;

    }

    /*Reverse linked list */
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;//
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    /*Middle elemet  */
    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome(Node head) {
        if (head == null && head.next == null) {
            return true;
        }
        Node midnode = findmid(head);

        Node prev = null;
        Node curr = midnode;
        Node next;
        /*reversse the linkelist */
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void addmiddle(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void zigzag() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;

        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextl, nextr;

        while (left != null && right != null) {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;
            right = nextr;
        }

    }
    public Node mergesort(Node head){

        if(head == null || head.next == null){
            return head;
        }
        Node mid = getmid(head);

        Node righthead = mid.next;
        mid.next = null;

        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        return merge(newleft , newright);

    }

    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;//to make righthead.next = midpoint

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

    private Node merge(Node head1 , Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!= null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergedll.next;
    }
  
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfirst(4);
        ll.addfirst(2);
        ll.addfirst(1);
;        ll.addfirst(9);
        ll.print();
     System.out.println();
       ll.head = ll.mergesort(head);
        ll.print();
        System.out.println();
        // System.out.println("after using zigzag method");
        // ll.zigzag();
        // ll.print();
        // ll.addmiddle(1, 6);

        // System.out.println("the key is located at :" + ll.iterativesearch(3));
        // System.out.println(ll.recsearch(2));
        // ll.print();
        // System.out.println("After reversing the linkedlist :");
        // ll.reverse();
        //     System.out.println("check the linkedlist is a palindrome :" + ll.palindrome(head));
        // // ll.deletenthNode(3);
        // // ll.removefirst();
        // // ll.removelast();
        // ll.print();
        // // System.out.println(size);
    }

}
