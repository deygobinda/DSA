package Stack;


public class arrayImplementation {

   public static class Stack{
       int[] arr = new int[5];
       private  int top = -1;
       int size = 0 ;
       Stack(){

       }

       private  void push(int val){
           if (size == arr.length){
               System.out.println("Stack is full");
               return;
           }
           top++;
           arr[top] = val;
           size++;

       }

       private  int pop(){
           if (top == -1){
               System.out.println("Stack is empty");
               return -1;
           }
           int x = arr[top];
           top--;
           size--;
           return x;
       }
       private void  display(){
           if (top == -1){
               System.out.println("The stack is empty");
               return;
           }
           for (int i = top ; i >= 0 ; i--){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
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
        st.pop();
        st.display();
        st.push(6);
    }
}
