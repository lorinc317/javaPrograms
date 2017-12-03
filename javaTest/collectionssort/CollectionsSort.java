package collectionssort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();

        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println("Before sort: ");
        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }
        
        Collections.sort(fruits);

        System.out.println("After sort: ");
         i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }

    }

}
