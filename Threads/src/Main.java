public class Main {
    public static void main(String[] args){

        // Thread.currentThread().setName("Mainnnnnn");
        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(9);
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive());

        // MyThread thread2=new MyThread();

        // Start the thread otherwise it wont run
        // thread2.start();
        // System.out.println(thread2.isAlive());

        // Naming a thread
        // thread2.setName("MyThread");
        // System.out.println(thread2.getName());

        // Priority of a thread **It inherits that of the main thread**
        // System.out.println(thread2.getPriority());

        // There are 2 types of thread,
        // Deamon threads is a low priority thread that runs in background to perform tasks such as garbage collection
        // and the JVM terminates itself when all user threads(non-deamon threads) finish their execution
        // System.out.println(thread2.isDaemon());




    }
}
