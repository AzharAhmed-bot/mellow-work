import java.util.*;

public class App {
    public static int fib(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
    
    public static int[] fib(int limit) {
        int[] result = new int[limit+1];
        result[0] = 0;
        result[1] = 1;
        fib(limit, result);
        return result;
    }

    

    public static void main(String[] args) throws Exception {
        int[] fibSeries=fib(20);
        System.out.println(Arrays.toString(fibSeries));
      
    }
}