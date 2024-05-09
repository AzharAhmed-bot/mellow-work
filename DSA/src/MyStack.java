import java.util.*;

public class MyStack {
    // Array list to store elements of the stack
    ArrayList<Integer> Frontier= new ArrayList<>();
   
    // No-argument constructor to initialize the stack
    public MyStack(){
        
    }

 


    // Add a new element to the top of the stack
    public void push(int newNode ){
        // Add the new node to the beginning of the array list
        Frontier.add(0,newNode);
    }

    // Remove the top element from the stack 
    public void pop(){
        if (!Frontier.isEmpty()) {
            // Remove the element at the beginning of the array list
            Frontier.remove(0); 
        } else {
            System.out.println("Stack is empty");
        }
    }

    // Remove and return the top element from the stack
    public int peek(){
        if(Frontier.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else{
            // Get the element at the beginning of the array list
            int node=Frontier.get(0);
            return node;
        }
    }
    

    // Print the elements of the stack
    public void print(){
       for(int i=0; i<Frontier.size();i++){
        System.out.println("Index("+i+") " + "---> Value: "+Frontier.get(i));
        System.out.println("\t\t↑");
       }
       System.out.println("\t\tBottom");
       
    }

    // Search for a given value in the stack and return the value if found
    public int search(int value){
        for(int i=0;i<Frontier.size();i++){
            if(Frontier.get(i) == value){
                System.out.println("Found  item in the frontier");
                return Frontier.get(i);
            }    
        }
        System.out.println("No such item in the frontier");
        return value;
    }

    // Return the size of the stack
    public void size(){
        System.out.println(Frontier.size());
    }

    public static void main(String[] args) {
        
        // Create a new instance of the Stack class
        MyStack stack=new MyStack();
        System.out.println("------------------Intial--------------------");
        // Push and print initial elements 1, 2, and 3 onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();

        // Push and print elements 4, 5, 6, 7, and 8 onto the stack
        System.out.println("------------------Push--------------------");
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.print();
       
        // Pop and print two elements from the stack
        System.out.println("------------------Popped--------------------");
        stack.pop();
        stack.pop();
        stack.print();

        System.out.println("------------------Peeking--------------------");
        System.out.println(stack.peek());
        stack.print();

        System.out.println("------------------Search for a value--------------------");
        System.out.println(stack.search(10));

        System.out.println("------------------Size of stack--------------------");
        stack.size();
    }
}