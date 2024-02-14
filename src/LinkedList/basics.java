package LinkedList;

public class basics {

    public static class Node{
        int data; // data of linked List
        Node next;  // stores the address of LL

        Node(int data){
            this.data = data;
        }
    }

    static void insertAtEnd(Node head , int val){
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null){
            t = t.next;
        }
        t.next = temp;
    }

    // Display function
    static void displayLinkedList(Node a){
        Node temp = a;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display linked list recursively
    static void displayLinkedListRecursively(Node head){
        if( head == null) return;
        System.out.print(head.data+" ");
        displayLinkedListRecursively(head.next);
    }

    //reverse a linked list
    static Node reverseList(Node head){
        Node prev = null;
        Node cur = head;
        Node agla = null;
        while (cur != null){
            agla = cur.next;
//            agla.next = cur;
            cur.next = prev;
            prev = cur;
            cur = agla;
        }
        return prev;
    }

    static int lengthOfLL(Node head){
        int length  = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Node a = new Node(3); // Head node
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7); // Tail node
        // 3 4 5 6 7  are not connected to each other
        System.out.println(a.next); // null
        a.next = b; // now 'a' is connected with b 3 -> 4 5 6 7
        System.out.println(a.next); // LinkedList.basics$Node@7b23ec81 (this is assumed to be address of b)
        b.next = c;
        c.next = d;
        d.next = e;
        // are connected  3 -> 4 -> 5 -> 6 -> 7

        // printing linked list
        System.out.println("The link list is");
//        Node temp = a;
//        for(int i = 1 ; i <= 5 ; i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

        displayLinkedList(a);
        System.out.println();
        System.out.println("Displaying linked list with the help of recursion");
        displayLinkedListRecursively(a);
        System.out.println();
        System.out.println("The length of the LinkedList is :"+lengthOfLL(a));
        System.out.println();
        insertAtEnd(a,20);
        System.out.print("Displaying List ");
        displayLinkedList(a);

        Node revesedList = reverseList(a);
        System.out.println("Displaying reversed list ");
        displayLinkedList(revesedList);


    }
}
