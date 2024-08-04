package Recursion;
import java.util.*;

public class App {
    public static int fib(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
    
    public static int[] fib_up_to(int limit) {
        int[] result = new int[limit+1];
        result[0] = 0;
        result[1] = 1;
        fib(limit, result);
        return result;
    }

    public static int gcd(int a, int b) {
        // Ensure a is always non-negative
        a = Math.abs(a);
        
      
        if (b == 0) {
          return a;
        }
      
        
        return gcd(b, a % b);
      }

    //   Method that converts integers to string
      public String toString(int num, int base){
        String lookUp="0123456789ABCDEF";
        if(num < base){
            return String.valueOf(lookUp.charAt(num));
        }
        return toString(num/base,base) + lookUp.charAt(num%base);
    }


    // Optimized method to find power of a number
    public int power(int base,int exp){
        if(exp==0){
            return 1;
        }
        if(exp==1){
            return base;
        }
        if(exp%2==0){
            return power(base*base , exp/2);
        }
        return base * power(base,exp-1);
    }

    // Method to find factorial of a number
    public int factorial(int num){
        if(num==0){
            return 1;
        }
        
        return num*factorial(num-1);
    }
      
      

    public static void main(String[] args) throws Exception {
        int[] fibSeries=fib_up_to(10);
        System.out.println(Arrays.toString(fibSeries));
        System.out.println(gcd(12, 513));
      
    }
}