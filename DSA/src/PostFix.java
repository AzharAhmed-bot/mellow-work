import java.util.*;
public class PostFix{
    public static int size;
    public static Stack<Integer> myStack;

    public PostFix(){
        myStack=new Stack<Integer>();
        size = 0;
    }

    public static int divide(int num1,int num2){
        if(num2==0){
            throw new ArithmeticException("Division by zero");
        }
        return num1 /num2;
    }
    public static int mult(int num1, int num2){
        return num1*num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static void enterExpression(){
        String digitRegex="\\d+";
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of expression: ");
        size=input.nextInt();
        if(size > 0) {
            for(int i=0; i<size; i++){
                System.out.print("Enter expression "+ (i+1) + ": ");
                String exp=input.next();
                if(exp.matches(digitRegex)){
                    myStack.push(Integer.parseInt(exp));
                }
                else{
                    int second=myStack.pop();
                    int first=myStack.pop();
                    int result;
                    switch (exp) {
                        case "+":
                            result = add(first, second);
                            break;
                        case "-":
                            result = sub(first, second);
                            break;
                        case "*":
                            result = mult(first, second);
                            break;
                        case "/":
                            result = divide(first, second);
                            break;
                        default:
                            System.out.println("Invalid operator: " + exp);
                            return;
                    }
                    myStack.push(result);

                }
               
            }
            System.out.println(myStack.toString());
        } else {
            System.out.println("Invalid size. Please enter a positive integer.");
        }
        input.close();
    }




    public static void main(String[] args) {
        PostFix PostFix = new PostFix();
        enterExpression();
    }
}