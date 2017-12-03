
package comparatorexample;

import java.util.Arrays;
import java.util.Comparator;


public class ComparatorExample {

    
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
        
        Arrays.sort(fruits, Fruit.FruitNameComparator);
        
        System.out.println("After sort: ");
        
        for(Fruit f: fruits)
        {
            System.out.println(f.toString());
        }
     
        
        Arrays.sort(fruits, Fruit.FruitQuantityComparator);
        
        System.out.println("After sort: ");
        
        for(Fruit f: fruits)
        {
            System.out.println(f.toString());
        }
        
    }
    
}

class Fruit 
{
    String name;
    double quantity;
    double pricePerKilo;
    
    public static Comparator<Fruit> FruitNameComparator
                          = new Comparator<Fruit>() {

            @Override
	    public int compare(Fruit fruit1, Fruit fruit2) {

	      String fruitName1 = fruit1.name.toUpperCase();
	      String fruitName2 = fruit2.name.toUpperCase();

	      //ascending order
	      return fruitName1.compareTo(fruitName2);
	    }

	}; 
    
    public static Comparator<Fruit> FruitQuantityComparator
                          = new Comparator<Fruit>() {

            @Override
	    public int compare(Fruit fruit1, Fruit fruit2) {

	      double q1 = fruit1.quantity;
	      double q2 = fruit2.quantity;

	      //ascending order
	      if(q1> q2) return 1;
              else if (q1 < q2) return -1;
              else return 0;
            }
	}; 
    
    public Fruit(String n, double q, double p)
    {
        this.name = n;
        this.quantity = q;
        this.pricePerKilo = p;
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


