public class DetectingloopLinkedlist {
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
    public boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }

        }
        return false;
    }

    public void removcycle(){
        Node slow = head;
        Node fast = head;

        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev =null;
        prev = fast;
        slow = slow.next;
        fast = fast.next;

        prev.next = null;

    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
     DetectingloopLinkedlist ll = new DetectingloopLinkedlist();
    // head   = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = head;

    Node head = new Node(1);
    Node temp = new Node(2);
   head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    System.out.println(ll.iscycle());
    // ll.removcycle();
    // ll.print();
    // System.out.println(ll.iscycle());

    }
    
}
