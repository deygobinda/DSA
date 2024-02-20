package Queque;

public class arrayImplementation {

    private static class Queue{
        int[] arr = new int[5];
        int size = 0 ;
         int front = -1 ;
        int rear = - 1;

        Queue(){

        }

        private void add(int data){
            if(front == - 1 && rear == -1){
                front = rear = 0;
                arr[rear] = data;
                size++;
            }else if(size == arr.length){
                System.out.println("The queue is full ");

            }
            else{
                rear++;
                arr[rear] = data;
                size++;
            }
        }

        private int poll(){
            if(front == -1){
                System.out.println("The queue is empty");
                return -1;
            }else if(front > rear){
                System.out.println("The queue is empty");
                return -1;
            }else{
                int x = arr[front];
                front++;
                size--;
                return x;
            }
        }

        private void display(){
            if(front == -1) {
                System.out.println("The queue is empty");
            }else if(front > rear){
                System.out.println("The queue is empty");
            } else{
                for(int i = front ; i <= rear ; i++){
                    System.out.print(arr[i] +" ");
                }
            }
            System.out.println();
        }


    }
    public static void main(String [] args){
        Queue qe = new Queue();
        qe.add(1);
        qe.display();
        qe.add(2);
        qe.display();

        qe.add(3);
        qe.display();

        qe.add(4);
        qe.display();

        qe.add(5);
        qe.display();

        qe.add(6);

        qe.display();
        qe.poll();
        qe.display();

        qe.poll();
        qe.display();

        qe.poll();
        qe.display();

        qe.poll();
        qe.display();



    }
}
