




public class Doublylinkedlist {

    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
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
        head.prev = newnode;
        head = newnode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = null;
            return;
        }

        tail.next = newnode;
        tail.prev = newnode;
        tail = newnode;

    }

    public int removefirst(){
        if(head == null){
            System.out.println("Doubly linkedlist is empty :");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int value = head.data;
            head = tail = null;
            size--;
            return value;

        }
        int val= head.data;
        head = head.next;
        head.prev =null;
        size--;
        return val;
    }

    public int removelast(){
        if(head == null){
            System.out.println("dll is empty :");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int value = head.data;
            head  = tail = null;
            size--;
            return value;
        }
        Node perv = head;
        for(int i =0;i<size -2;i++){
            perv = perv.next;
        }
        int value = perv.next.data;
        perv.next = null;
        tail = perv;
        size--;
        return value;
    }


    public static void main(String[] args) {
        Doublylinkedlist dll = new Doublylinkedlist();
        dll.addfirst(4);
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.addlast(5);
        dll.print();
        dll.removelast();
        dll.print();
        System.out.println();
     dll.removefirst();
        dll.print();

    }

}
