package waitandnotify;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitandNotify {

   static final ThreadClassB b=new ThreadClassB("alma");;
    static  final ThreadClassA a= new ThreadClassA("korte");
    public static void main(String[] args) {
        a.start();
        b.start();
    }
    
}



class ThreadClassA extends Thread
{
    String name;
    Thread t=null;
    
    @Override
    public void run()
    {
        synchronized(this) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadClassA.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            }
        for(int i = 0; i < 5; i++)
        {
            System.out.println("This is thread " + name + " inc " + i);
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
        System.out.println(name + " is created");
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
            System.out.println("This is thread " + name + " dec " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadClassA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        synchronized(WaitandNotify.a) {
            WaitandNotify.a.notify();    
            }
    }
    
    public ThreadClassB(String n)
    {
        this.name = n;
        System.out.println(name + " is created");
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

