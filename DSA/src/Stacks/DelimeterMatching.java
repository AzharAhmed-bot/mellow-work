package Stacks;

import java.util.*;

    
public class DelimeterMatching {
    public String word;
    public MyStack charStack;
    public DelimeterMatching(){
        charStack=new MyStack(100);
    }
    public void askUser(){
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter a word: ");
      word=scanner.nextLine();
      scanner.close();
    }
    public void matching() {
        String openDelimiterRegex = "[({\\[<]";
        String closeDelimiterRegex = "[\\)}\\]>]";
    
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (String.valueOf(currentChar).matches(openDelimiterRegex)) {
                charStack.push(currentChar);
            } else if (String.valueOf(currentChar).matches(closeDelimiterRegex)) {
                if(!charStack.isEmpty()){
                    if(isMatchingPair((char)charStack.peek(),currentChar)){    
                        charStack.pop();
                    }
                    else{
                        charStack.push(currentChar);
                    }
                }
            }
        }
    }
    
    public void verify(){
        if(charStack.isEmpty()){
            System.out.print(word+": No mismatch delimiter");
        }
        else{
            System.out.print(word+": Mismatch delimiter");
        }
        System.out.println();
    }

    public boolean isMatchingPair(char open,char close){
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']') ||
               (open == '<' && close == '>');
    }

    public static void main(String[] args) {
        DelimeterMatching delimeterMatching=new DelimeterMatching();
        delimeterMatching.askUser();
        delimeterMatching.matching();
        delimeterMatching.verify();
    }
}
