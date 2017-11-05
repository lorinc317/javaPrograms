public class Test { 

   public static void main(String args[]) {
      int x =Integer.parseInt("9");
      double c = Double.parseDouble("5");
      int b = Integer.parseInt("444",16);

      System.out.println(x);
      System.out.println(c);
      System.out.println(b);
   }
}

public class XXXValue { 

   public static void main(String args[]) {
      Integer x = 5;
      
      // Returns byte primitive data type
      System.out.println( x.byteValue() );

      // Returns double primitive data type
      System.out.println(x.doubleValue());

      // Returns long primitive data type
      System.out.println( x.longValue() );      
   }
}

public class CompareTo { 

   public static void main(String args[]) {
      Integer x = 5;
      
      System.out.println(x.compareTo(3)); /* 1 */
      System.out.println(x.compareTo(5)); /* 0 */
      System.out.println(x.compareTo(8)); /* -1 */           
   }
}

public class Equals { 

   public static void main(String args[]) {
      Integer x = 5;
      Integer y = 10;
      Integer z =5;
      Short a = 5;

      System.out.println(x.equals(y));  /* false */
      System.out.println(x.equals(z)); /* true */
      System.out.println(x.equals(a));/* false */
   }
}

public class ValueOf { 

   public static void main(String args[]) {
      Integer x =Integer.valueOf(9);
      Double c = Double.valueOf(5);
      Float a = Float.valueOf("80");               
      Integer b = Integer.valueOf("444",16);

      System.out.println(x); 
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
   }
}

public class ToString { 

   public static void main(String args[]) {
      Integer x = 5;

      System.out.println(x.toString());  
      System.out.println(Integer.toString(12)); 
   }
}

public class Test { 

   public static void main(String args[]) {
      Integer a = -8;
      double d = -100;
      float f = -90;

      System.out.println(Math.abs(a));
      System.out.println(Math.abs(d));     
      System.out.println(Math.abs(f));    
   }
}

public class Test { 

   public static void main(String args[]) {
      double d = -100.675;
      float f = -90;    

      System.out.println(Math.ceil(d));
      System.out.println(Math.ceil(f)); 

      System.out.println(Math.floor(d));
      System.out.println(Math.floor(f)); 
   }
}

public class Test { 

   public static void main(String args[]) {
      double d = -100.675;
      float f = -90;

      System.out.println(Math.floor(d));
      System.out.println(Math.floor(f)); 

      System.out.println(Math.ceil(d));
      System.out.println(Math.ceil(f));
   }
}

public class Test {

   public static void main(String args[]) {
      System.out.println(Math.min(12.123, 12.456));      
      System.out.println(Math.min(23.12, 23.0));  
   }
}

public class Test { 

   public static void main(String args[]) {
      System.out.println(Math.max(12.123, 12.456));      
      System.out.println(Math.max(23.12, 23.0));  
   }
}

public class Test { 

   public static void main(String args[]) {
      double x = 11.635;
      double y = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(x));  
   }
}

public class Test { 

   public static void main(String args[]) {
      double x = 11.635;
      double y = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));
   }
}

public class Test { 

   public static void main(String args[]) {
      double x = 11.635;
      double y = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));
   }
}

public class Test { 

   public static void main(String args[]) {
      double x = 45.0;
      double y = 30.0;

      System.out.println( Math.toDegrees(x) );
      System.out.println( Math.toDegrees(y) );
   }
}

public class Test { 

   public static void main(String args[]) {
      double x = 45.0;
      double y = 30.0;

      System.out.println( Math.toRadians(x) );
      System.out.println( Math.toRadians(y) );
   }
}

public class Test { 

   public static void main(String args[]) {
      System.out.println( Math.random() );
      System.out.println( Math.random() );
   }
}

