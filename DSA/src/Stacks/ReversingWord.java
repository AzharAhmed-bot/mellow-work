package Stacks;


import java.util.*;

public class ReversingWord {
    public String word;
    MyStack charStack;
    public ReversingWord(){
        charStack=new MyStack(100);
    }
    public void askUser(){
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter a word: ");
      word=scanner.nextLine();
      scanner.close();
    }
    public void reversing(){
        System.out.println("Original word:"+ word);
        for(int i=0; i<word.length();i++){
            charStack.push(word.charAt(i));
        }
        System.out.print("Reversed word: ");
        while (!charStack.isEmpty()) {
            System.out.print(charStack.pop());
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        ReversingWord myString=new ReversingWord();
        myString.askUser();
        myString.reversing();
    }
}
