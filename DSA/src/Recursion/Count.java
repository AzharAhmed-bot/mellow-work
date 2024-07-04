package Recursion;

import java.util.*;

public class Count {
    // Method that counts down from a certain number of seconds
    public static int countDown(int n) throws InterruptedException {
        if (n == 0) {
            System.out.println(n);
            return n;
        }
        Thread.sleep(1000);
        System.out.println(n);
        return countDown(n - 1);
    }

    // Method that counts up from start to end
    public static int countUp(int start, int end) throws InterruptedException {
        if (start > end) {
            return end;
        }
        Thread.sleep(1000);
        System.out.println(start);
        return countUp(start + 1, end);
    }

    // Method that returns the sum of numbers from 1 to n
    public static int countSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + countSum(n - 1);
    }

    // Priny elements of an array in a recursion
    public void printElementsOfArray(int[] myarray,int index){
        
        if(myarray.length == index){
            return;
        }

        System.out.println(myarray[index]);
        printElementsOfArray(myarray, index+1);

    }


    // To find gcd of a number
    public static int gcd(int a, int b) {
        // Ensure a is always non-negative
        a = Math.abs(a);
        
      
        if (b == 0) {
          return a;
        }
      
        
        return gcd(b, a % b);
      }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Count Down:");
        countDown(10);
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = prompt.nextInt();
        System.out.print("Enter end: ");
        int end = prompt.nextInt();
        System.out.print("Count Up: " + countUp(start,end));

        prompt.close();

        System.out.println("Count sum:");
        System.out.println(countSum(10));
    }
}
