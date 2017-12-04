package runnabledemo;

import java.util.logging.Level;
import java.util.logging.Logger;

class RunnableDemo {

    static RunnableClass[] threadArray;
    
    public static void main(String[] args) throws InterruptedException {
        threadArray = new RunnableClass[4];
          //  demo1();
            demo2();
        RunnableClass alma = new RunnableClass("Alma");
        alma.start();
        alma.t.join();
        
        System.out.println("DONE");
        
    }

    public static void demo1() {
        threadArray[0] = new RunnableClass("FirstThread");
        threadArray[1] = new RunnableClass("SecondThread");

        threadArray[0].start();
        threadArray[1].start();
    }

    public static void demo2() throws InterruptedException {
        threadArray[2] = new RunnableClass("First");
        threadArray[3] = new RunnableClass("Second");

        threadArray[2].start();
        threadArray[2].t.join();
        threadArray[3].start();
    }
    
}

class RunnableClass implements Runnable {

    public Thread t = null;
    public String threadName;

    public RunnableClass(String name) {
        this.threadName = name;
        System.out.println("Runnable object created " + threadName);
    }

    @Override
    public void run() {
        System.out.println("The thread is runing: " + threadName);

        System.out.println("The " + threadName + " is going to sleep");
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("The " + threadName + " is running again");

    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.setName(threadName);
            t.start();
        }
    }

}
