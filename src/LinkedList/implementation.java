package LinkedList;



public class implementation {

    public static class  Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
        }

        Node (){

        }
    }
    public  static class LinkedList{
        Node head = null;
        Node tail = null;
        int size  = 0 ;


        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else {
                tail.next = temp;
            }
            tail= temp;
            size++;
        }

        void insertAtBegining(int val){
            Node temp = new Node(val);
            if(head == null){
                tail = temp;
            }else {
                temp.next = head;
            }
            head= temp;
            size++;
        }
        void insertAt(int idx , int val){
            Node t = new Node(val);
            if( idx == size){
                insertAtEnd(val);
                return;
            }
            if(idx == 0){
                insertAtBegining(val);
                return;
            }
            Node temp = head;
            for (int i =  1 ; i <= idx-1 ; i++ ){
                temp  = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        void display(){
            Node temp = head;
            while (temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        int getElement(int idx){
            Node temp = head;
            for (int i = 1 ;  i <= idx ; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            Node temp = head;
            for (int i = 1 ; i <= idx-1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size-1) tail = temp;
            size--;
        }

        //find nth node from the last

        Node findNode(Node head , int n){
            Node temp = head;
            for(int i = 1 ; i <=size - n; i++){
                temp = temp.next;
            }
            return temp;
        }

        Node findNodeInN(Node head , int n){
            Node fast = head;
            Node slow = head;
            for (int i = 1 ; i <= n; i++){
                fast = fast.next;
            }

            while (fast != null){
                slow = slow.next;
                fast = fast.next;

            }

            return  slow;
        }

        Node deleteFromEndNthIndex(Node head, int n) {
            Node fast = head;
            Node slow = head;

            // Move fast pointer n positions ahead
            for (int i = 1; i <= n; i++) {
                if (fast == null) {
                    // Handle the case where n is greater than the number of nodes
                    return head;
                }
                fast = fast.next;
            }

            // Handle the case where we need to delete the head node
            if (fast == null) {
                head = head.next;
                return head;
            }

            // Move both pointers until fast reaches the end
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            // Delete the nth node from the end
            slow.next = slow.next.next;

            return head;
        }




    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        System.out.println(ll.size);
        System.out.println("After inserting at end ");
        ll.display();
        ll.insertAtBegining(88);
        ll.insertAtBegining(85);
        ll.insertAtBegining(86);
        ll.insertAtBegining(8);
        System.out.println();
        System.out.println("After inserting at beginning ");
        ll.display();
        ll.insertAt(3,12);
        ll.insertAt(3,63);
        ll.insertAt(3,52);
        ll.insertAt(3,50);
        ll.insertAt(3,57);
        System.out.println();
        System.out.println("After inserting at index ");
        ll.display();
        System.out.println();
        System.out.println(ll.size);
        System.out.println(ll.getElement(11));
        ll.deleteAt(14);
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println("The tail is " +ll.tail.data);
        System.out.println(ll.size);

        int nthData = ll.findNode(ll.head,14).data;
        System.out.println(nthData);
        nthData = ll.findNodeInN(ll.head,14).data;
        System.out.println(nthData);

        ll.head = ll.deleteFromEndNthIndex(ll.head,14);
        ll.display();

        System.out.println();



    }
}
