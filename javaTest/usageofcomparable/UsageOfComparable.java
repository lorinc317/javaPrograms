
package usageofcomparable;

import java.util.Arrays;


public class UsageOfComparable {

   
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];
        
        fruits[2] = new Fruit("Apple", 3, 2);
        fruits[0] = new Fruit("Orange", 7, 9);
        fruits[1] = new Fruit("pinapple", 1, 13);
        
        System.out.println("Before sort: ");
        
        for(Fruit f: fruits)
        {
            System.out.println(f.toString());
        }
        
        Arrays.sort(fruits);
        
        System.out.println("After sort: ");
        
        for(Fruit f: fruits)
        {
            System.out.println(f.toString());
        }
        
    }
    
}

class Fruit implements Comparable <Fruit>
{

    String name;
    double quantity;
    double pricePerKilo;
    
    public Fruit(String n, double q, double p)
    {
        this.name = n;
        this.quantity = q;
        this.pricePerKilo = p;
    }
    
    @Override
    public int compareTo(Fruit t) {
         return this.name.compareTo(t.name);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.name + "\n");
        sb.append("Quantity: " + this.quantity + "\n");
        sb.append("Dollars per kilo: " + this.pricePerKilo + "\n");
        
        return sb.toString();
    }
}