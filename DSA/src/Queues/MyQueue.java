package Queues;

public class MyQueue {
 public int maxSize;
 public int[] queueArray;
 public int front;
 public int rear;

 public MyQueue(int size){
     this.maxSize=size;
     queueArray=new int[maxSize];
     front=0;
     rear=-1;
 }

 public void enqueue(int data) {
    if (isFull()) {
        System.out.println("Queue is full. Cannot enqueue " + data);
        return;
    }
    rear = (rear + 1) % maxSize;
    queueArray[rear] = data;
}


   /**
    * Removes and returns the front element of the queue.
    * Proccess:
    * It checks if the queue is empty first
    * If the queue has only one element it resets the values back to original values
    * Else it increments the front by 1 and finds the modulus of it from the maxsize 
    * Example is if the fron element is index 4 it 4+1%5=0
    * @return the front element of the queue, or -1 if the queue is empty
    */
    public int dequeue() {
        int data=queueArray[front++];
        if(front==maxSize){
            front=0;
        }
        return data;
    }
    

 public boolean isFull(){
    return (rear+2) % maxSize==front;
 }
 public boolean isEmpty(){
    return rear+1==front;
 }
 public void print(){
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    
    int current = front;
    System.out.print("Queue: ");
    while (current != rear) {
        System.out.print(queueArray[current] + "<--");
        current = (current + 1) % maxSize;
    }
    System.out.print(queueArray[rear] + " ");
    System.out.println("(rear)");
}


 

 public static void main(String[] args) {
     MyQueue myQueue=new MyQueue(5);
     myQueue.enqueue(0);
     myQueue.enqueue(1);
     myQueue.enqueue(2);
     myQueue.enqueue(3);
     myQueue.enqueue(4);
     myQueue.print();
    //  myQueue.enqueue(5);
     myQueue.enqueue(6);
    //  myQueue.enqueue(7);
    //  myQueue.print();
 }


}
