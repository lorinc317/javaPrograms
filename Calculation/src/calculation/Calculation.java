package calculation;

public class Calculation {

    
    public static void main(String[] args) {
       Multiply mu = new Multiply();
       Addition ad = new Addition();
       Addition am = new Multiply();
       
       mu.add(1, 1);
       mu.multiply(2, 3);
       ad.add(4, 6);
       
       am.add(2, 2);
       /*mu.multiply(2, 3); compile error */
    }
    
}

class Addition
{
    protected int z;
    
    public void add(int x, int y)
    {
        this.z = x + y;
        System.out.println("Result of addition :" + z);
    }
    
    public void sub(int x, int y)
    {
        this.z = x - y;
        System.out.println("Result of subtraction :" + z);
    }
    
}

class Multiply extends Addition
{
    public void multiply(int x, int y)
    {
        this.z = x* y;
        System.out.println("Result of multiplication :" + z);
    }
}