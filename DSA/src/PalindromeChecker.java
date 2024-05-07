import java.util.Stack;

public class PalindromeChecker {
    

    public static boolean isPalindrome(String word){
        int length=word.length();
        int halflength=length/2;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<halflength;i++){
            stack.push(word.charAt(i));
        }

        // Adjust the start index based on half length of stack
        int startIndex=length%2 == 0 ? halflength : halflength+1;

        for(int i=startIndex; i<length;i++){
            if(word.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word1 = "mom";
        String word2 = "hello";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
    }
}
