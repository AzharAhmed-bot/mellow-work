package Stacks;

public class MyStack {
    public int maxSize;
    public Object[] stackArray;
    public int top;

    public MyStack(int size){
        this.maxSize=size;
        stackArray=new Object[maxSize];
        top=-1;
    }


    /**
     * Pushes a new element onto the stack.
      * It checks if the stack is full at first
     * It increments the top then pushes the data to the top.
     * @param  data  the element to be pushed onto the stack.
     */
    public void push(Object data){
        if(isFull()){
            System.out.println("The stack is full!");
        }
        else{
            stackArray[++top]=data;
        }
        
    }

    /**
     * Removes and returns the top element from the stack.
     * It checks if the stack is empty at first.
     * It decrements the size of the array by one.
     * @return the top element from the stack
     */
    public Object pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            return stackArray[top--];
        }
        
    }

        /**
     * Checks and returns the top element of the stack
     *
     * @return  description of return value
     */
    public Object peek(){
        return stackArray[top];
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void print(){
        for(int i=top;i>=0;i--){
            System.out.println(stackArray[i]);
            System.out.println("↑");
        }
        System.out.println("Bottom");
    }
    public static void main(String[] args) {
        System.out.println("Hello!");
        MyStack stack=new MyStack(5);
        stack.push(0);
        stack.push(1);
        stack.push("Ahmed");
        stack.push(3);
        stack.push("Azhar");
        stack.print();
        stack.push(10);
        System.out.println(stack.peek());
    }
}
