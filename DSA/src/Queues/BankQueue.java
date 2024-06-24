package Queues;

public class BankQueue {
    public int maxSize;
    public String[] queueArray;
    public int front;
    public int rear;
    public int codeCounter;

    public BankQueue(int size) {
        this.maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        codeCounter = 1;
    }

    public void enqueue(String name) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + name);
            return;
        }
        rear = (rear + 1) % maxSize;
        String code = "C" + codeCounter++;
        queueArray[rear] = code + " - " + name;
        System.out.println(name + " has been assigned code: " + code);
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        String data = queueArray[front];
        front = (front + 1) % maxSize;
        return data;
    }

    public boolean isFull() {
        return (rear + 2) == front;
    }

    public boolean isEmpty() {
        return rear == -1 || front == (rear + 1) % maxSize;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int current = front;
        System.out.print("Queue: ");
        while (current != rear) {
            System.out.print(queueArray[current] + " <-- ");
            current = (current + 1) % maxSize;
        }
        System.out.print(queueArray[rear] + " ");
        System.out.println("(rear)");
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No one to call out.");
            return null;
        }
        return queueArray[front];
    }
}
