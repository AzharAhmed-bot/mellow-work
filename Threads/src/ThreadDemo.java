public class ThreadDemo implements Runnable {
    public static Thread thread1;
    public static ThreadDemo threadDemo;

    public static void main(String[] args) {
        threadDemo = new ThreadDemo();
        thread1 = new Thread(threadDemo);

        // Thread1 created and is currently in the NEW state.
        System.out.println(
            "State of thread1 after creating it - "
            + thread1.getState());
        thread1.start();

        // Thread1 moved to Runnable state
        System.out.println(
            "State of thread1 after calling .start() method on it - "
            + thread1.getState());
    }

    public void run() {
        MyThread myThread = new MyThread();
        Thread thread3 = new Thread(myThread);

        // Thread2 created and is currently in the NEW state.
        System.out.println(
            "State of thread3 after creating it - "
            + thread3.getState());
        thread3.start();

        // Thread3 moved to Runnable state
        System.out.println(
            "State of thread3 after calling .start() method on it - "
            + thread3.getState());

        // Moving thread1 to timed waiting state
        try {
            // Moving thread1 to timed waiting state
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "State of thread3 after calling .sleep() method on it - "
            + thread3.getState());

        try {
            // Waiting for thread3 to die
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "State of thread3 when it has finished its execution - "
            + thread3.getState());
    }
}