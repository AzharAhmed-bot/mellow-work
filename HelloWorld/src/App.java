import java.util.Scanner;

class AddTwoNumbers{
public static void main(String a[]){
   // Create A scanner object to take input from user
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the Test Mark: ");
    int testMark =scanner.nextInt();

    char grade=ComputeGrade(testMark);
    // Display the result
    System.out.println("Grade: " + grade);

     // Close the scanner
    scanner.close();


}
public static char ComputeGrade(int mark){
        char grade;
        if (mark>=90) return 'A';
        else if (mark >=85 && mark < 90 )grade='B';
        else if (mark >=75 && mark < 85 )grade= 'C';
        else if (mark >=65 && mark < 75 )grade= 'D';
        else grade='F';

        return grade;
}

}
