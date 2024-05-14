// Java program to demonstrate thread states

class MyThread implements Runnable {
    public void run() {
        // Moving thread2 to timed waiting state
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
            "State of thread3 while it called join() method on thread3 -"
            + ThreadDemo.Thread3.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
