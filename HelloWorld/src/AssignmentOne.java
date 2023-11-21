import java.util.Scanner;

public class AssignmentOne {
   public static void main(String a[]){
        Input();

   }


   //Object that takes input from the user
   public static void Input(){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter your Grade: ");
    int grade =scanner.nextInt();

    System.out.print("Enter Interview Score: ");
    int interview_score =scanner.nextInt();

    System.out.print("Enter confidence level score: ");
    int confidance_level =scanner.nextInt();

    //To prevent Resource leak
    scanner.close();

    Compute(grade, interview_score, confidance_level);
   }


   //Object that computes the result
   public static void Compute(int grade,int intScore,int confLevel){
      if (grade >= 65) {
         if (intScore >= 6 || confLevel > 5) {
             OutPut("Congratulations you have passed");
         } 
         else{
            OutPut("Sorry! You are failed in both interview and confidence level");
         }
     } else {
         OutPut("Sorry! You have failed in your grade.");
     }

   } 

   //This object handles the OutPut Message
   public static void OutPut(String message){

    System.out.println(message);
   }

}
