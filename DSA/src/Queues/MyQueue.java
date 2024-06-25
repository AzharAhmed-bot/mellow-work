package Queues;

public class MyQueue {
    public int maxSize;
    public int[] queueArray;
    public int front;
    public int rear;
    public int currentSize;  // To keep track of the current number of elements

    public MyQueue(int size) {
        this.maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = data;
        currentSize++;
    }

    /**
     * Removes and returns the front element of the queue.
     * 
     * @return the front element of the queue, or -1 if the queue is empty
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int data = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return data;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int current = front;
        System.out.print("Queue: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArray[current] + "<--");
            current = (current + 1) % maxSize;
        }
        System.out.println("(rear)");
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        myQueue.enqueue(0);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.enqueue(10);  // Should not enqueue as the queue is full
        myQueue.enqueue(11);  // Should not enqueue as the queue is full
        myQueue.enqueue(12);  
        myQueue.print();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(10);
        myQueue.enqueue(11);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.print();
    }
}
