package Queues;

import java.util.Scanner;

public class BankQueueTest {
    public static void main(String[] args) {
        MyQueue bankQueue = new MyQueue(10);
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (enqueue, dequeue, peek, print, exit):");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "enqueue":
                    System.out.println("Enter customer name:");
                    String name = scanner.nextLine().trim();
                    bankQueue.enqueue(name);
                    break;
                case "dequeue":
                    String servedCustomer = bankQueue.dequeue();
                    if (servedCustomer != null) {
                        System.out.println(servedCustomer + " has been served.");
                    }
                    break;
                case "peek":
                    String nextCustomer = bankQueue.peek();
                    if (nextCustomer != null) {
                        System.out.println("Next customer to be served: " + nextCustomer);
                    }
                    break;
                case "print":
                    bankQueue.print();
                    break;
                case "exit":
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}
