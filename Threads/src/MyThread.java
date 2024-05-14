public class MyThread extends Thread {

 @Override
 public void run(){
    if(this.isDaemon()){
        System.out.println("This deamon thread is running");
    }
    else{
        System.out.println("This user thread is running");
    }
    
 }

}
