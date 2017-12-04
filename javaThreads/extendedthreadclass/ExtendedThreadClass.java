
package extendedthreadclass;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExtendedThreadClass {

   
    public static void main(String[] args) throws InterruptedException {
        new ThreadClassA("increment").start();
        System.out.println(Thread.activeCount());
        new ThreadClassB("decrement").start();
        System.out.println(Thread.activeCount());
        
        Thread.sleep(300);
        System.out.println(Thread.activeCount());
       
    }
    
}


class ThreadClassA extends Thread
{
    String name;
    Thread t=null;
    
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is thread " + name + " " + i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadClassA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ThreadClassA(String n)
    {
        this.name = n;
    }
    
    @Override
    public void start()
    {
        if(t==null)
        {
            t = new Thread(this);
            t.setName(name);
        }
        
        t.start();
    }
}


class ThreadClassB extends Thread
{
    String name;
    Thread t=null;
    
    @Override
    public void run()
    {
        for(int i = 20; i > 5; i--)
        {
            System.out.println("This is thread " + name + " " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadClassA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ThreadClassB(String n)
    {
        this.name = n;
    }
    
    @Override
    public void start()
    {
        if(t==null)
        {
            t = new Thread(this);
            t.setName(name);
        }
        
        t.start();
    }
}
