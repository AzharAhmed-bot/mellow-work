package Stacks;

import java.util.Scanner;

public class PalindromChecker {

    public String word;
    public MyStack charStack;

    public PalindromChecker(){
        charStack=new MyStack(100);
    }

    public void askUser(){
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter a word: ");
      word=scanner.nextLine();
      scanner.close();
    }

    public void verifyPalindrom(){
        for(int i=0; i<word.length();i++){
            charStack.push(Character.toLowerCase(word.charAt(i)));
        }
        String reversedWord="";
        while (!charStack.isEmpty()) {
            reversedWord+=charStack.pop();
            
        }
        if(word.equals(reversedWord)){
            System.out.println(word+": is a Palindrom");
        }
        else{
            System.out.println(word+": is not a Palindrom");
        }

        
    }
    public static void main(String[] args) {
        PalindromChecker palindromChecker=new PalindromChecker();
        palindromChecker.askUser();
        palindromChecker.verifyPalindrom();
    }

}
