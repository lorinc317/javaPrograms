
package simplearraysort;

import java.util.Arrays;


public class SimpleArraySort {

    
    public static void main(String[] args) {
        
        String[] fruits = new String[]{"Orange", "Banana", "Apple", "Pinapple"};
        
        System.out.println("Before sort: ");
        int i = 0;
        for(String s: fruits)
        {
            System.out.println("fruit " +(++i) + " " + s);
        }
        
        Arrays.sort(fruits);
        System.out.println("After sort: ");
         i = 0;
        for(String s: fruits)
        {
            System.out.println("fruit " +(++i) + " " + s);
        }
    }
    
}
