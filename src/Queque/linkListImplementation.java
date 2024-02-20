package Queque;

public class linkListImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    private static class Queue {
        private Node front;
        private Node rear;
        int size = 0;

        Queue() {

        }

        private void insert(int data) {
            Node temp = new Node(data);
            if (front == null && rear == null) {
                front = rear = temp;
            } else {
                rear.next = temp;
                rear = rear.next;
            }
            size++;
        }

        private int delete() {
            if (front == null) {
                System.out.println("The queue is empty");
                return -1;
            } else {
                int x = front.data;
                front = front.next;
                size--;
                return x;
            }
        }

        private void display() {
            if (front == null) {
                System.out.println("The queue is empty");
            }else{
                Node temp = front ;
                while(temp != null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Queue qe = new Queue();
        qe.insert(1);
        qe.display();
        qe.insert(2);
        qe.display();

        qe.insert(3);
        qe.display();

        qe.insert(4);
        qe.display();

        qe.insert(5);
        qe.display();

        qe.insert(6);

        qe.display();
        qe.delete();
        qe.display();

        qe.delete();
        qe.display();

        qe.delete();
        qe.display();

        qe.delete();

        qe.display();

        qe.delete();
        qe.display();

        qe.delete();
        qe.display();


    }

}
