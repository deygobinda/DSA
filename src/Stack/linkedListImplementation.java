package Stack;

public class linkedListImplementation {
    public static class LinkedList{
        int data;
        LinkedList next;
        LinkedList(int data){
            this.data = data;
        }

    }
    public  static  class Stack{
        LinkedList head ;
        int size = 0;
        void push(int val){
            LinkedList tem = new LinkedList(val);
            tem.next = head;
            head = tem;
            size++;
        }

        void display(){
        displayre(head);
        System.out.println();
        }
        void displayre(LinkedList head){
            if(head == null) return;
            displayre(head.next);
            System.out.print(head.data+" ");
        }

        void displayReverse(){
            if(head == null){
                System.out.println("The stack is empty");
                return;
            }
            LinkedList temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int pop(){
            if (head == null){
                System.out.println("The stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }






    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        System.out.println("The poped element is "+ st.pop());
        st.display();
        st.push(6);
        st.display();
        System.out.println("The size is " +st.size);
        st.displayReverse();
    }
}
