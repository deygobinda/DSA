package Queque;

import java.util.Queue;

public class circularQueueArray {

    public static class Queue{
        int[] arr = new int[5];
        int front = -1 ;
        int rear = -1 ;
        int size = 0 ;

        Queue(){

        }

        private void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("The queue is full");
            } else if (size == 0) {
                front = rear = 0;
                arr[rear] = val;
                size++;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
                size++;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[rear] = val;
                size++;
            }
        }

        private int poll() throws Exception{
            if (size == 0){
                throw new Exception("The queue is empty");
            } else{
                int x = arr[front];
               if (front == arr.length-1){
                   front = 0;
               }else {
                   front++;
               }
                size--;
                return x;
            }

        }

        private void display(){
            if (size == 0){
                System.out.println("The queue is empty");
                return;
            }else {
                if (front <= rear){
                    for (int i = front ; i <= rear ; i++){
                        System.out.print(arr[i]+" ");
                    }
                }else{
                    for (int i  = front ; i < arr.length; i++){
                        System.out.print(arr[i]+" ");
                    }
                    for (int i = 0 ; i <= rear ; i++){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception{
        Queue qe = new Queue();
        qe.display();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
//        qe.display();
        qe.poll();
//        qe.display();
        qe.add(5);
//        qe.display();
        qe.add(7);
        qe.display();
        System.out.println(qe.poll());
        qe.display();
        qe.add(8);
        qe.display();
        qe.poll();
        qe.display();
        qe.add(9);
        qe.display();
        // printing the array
        for (int i = 0 ; i < qe.arr.length; i++){
            System.out.print(qe.arr[i]+" ");
        }
    }
}
