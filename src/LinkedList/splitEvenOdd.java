package LinkedList;

public class splitEvenOdd {
    public  static class  Node{
        int val;
        Node next;

        Node(int val){
           this.val = val;
        }
    }
    public static class linkedList{
        Node head ;
        Node tail;

        void intsertAtEnd(int val){
            Node t = new Node(val);
            if (head == null ){
                head = t;
            }else {
                tail.next = t;

            }
            tail = t;
        }

        void  display(){
            Node t = head;
            while (t != null){
                System.out.print(t.val+" ");
                t = t.next;
            }
            System.out.println();
        }
        void splitEvenOdd(){
            linkedList even = new linkedList();
            linkedList odd = new linkedList();
            Node temp = head;
            while (temp != null){
                if(temp.val % 2 == 0){
                    even.intsertAtEnd(temp.val);
                }else {
                    odd.intsertAtEnd(temp.val);
                }
                temp = temp.next;
            }
            even.display();
            odd.display();

        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.intsertAtEnd(1);
        list.intsertAtEnd(2);
        list.intsertAtEnd(3);
        list.intsertAtEnd(4);
        list.intsertAtEnd(5);
        list.display();
        list.splitEvenOdd();
    }
}
