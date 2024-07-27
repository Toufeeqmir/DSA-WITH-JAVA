public class practicedelete {
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

    public Node delete(Node head , int m , int n){
        if(head == null){
            return null;
        }
       Node curr  = head;
       int count = 1;
       while(curr != null){
        while(count < m && curr != null){
            curr = curr.next;
            count++;
        }
        if(curr!= null){
            Node temp = curr;
            count = 0;
            while(count < n && temp.next != null){
                temp = temp.next;
                count++;
            }
            curr.next = temp.next;
            curr = curr.next;
            count = 1;
        }
       }
       return head;
    }
    public static void main(String[] args) {
        practicedelete ll = new practicedelete();
        Node head  = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next =new Node(8);
        Node newhead = ll.delete(head, 2 , 2);
        while(newhead != null){
            System.out.print(newhead.data + " ");
            newhead  = newhead.next;
        }
        System.out.println("null");
    }
    
}
