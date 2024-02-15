// import java.util.Scanner;

public class Account{

public String name;
public double balance;



//Constructor method
public Account(String name , double balance){
    this.name = name;
    this.balance=balance;

}


public double getBalance(){
 return this.balance;
}

public void getName(){
 System.out.println("My name: " +this.name);
}


public void setName(String name ){
    this.name=name;
    this.getName();
}


public static void main(String a[]){
    //I have defined an Object/Instance called Azhar
    Account Azhar=new Account("Azhar", 54565678);
    //new instance means new object
    Account Louis=new Account("Louis",324444);
   
    Azhar.getName();
    Louis.getName();
    Louis.getBalance();

    
}



}
