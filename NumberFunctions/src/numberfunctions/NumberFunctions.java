package numberfunctions;

public class NumberFunctions {

    
    public static int reverseDigits( int num)
    {
        return Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
    }
    
    public static void main(String[] args) {
        
       int i = 5000;
        double gpa =  13.0;
        float var = (float) 13.34;
       double mask = 0xaf; 
       
       Integer x = 5; // boxes int to an Integer object
      x =  x + 10;   // unboxes the Integer to a int
      System.out.println(x.toString()); 
      System.out.println(Integer.compare(3, 5)); /* -1*/
      System.out.println(Integer.parseInt("12"));
      try{
      System.out.println(Integer.parseInt("1a2"));
      }
      catch(NumberFormatException e)
      {
          //e.printStackTrace();
          System.out.println("Wrong number format");
      }
      System.out.println(Integer.valueOf(5).compareTo(4));
      System.out.println(Integer.valueOf(4).compareTo(Integer.valueOf(5)));
      System.out.println(Integer.valueOf(5).compareTo(Integer.valueOf(5)));
      
      
      System.out.println(Integer.reverse(1)); /* reverse bits */
      
      System.out.println(reverseDigits(423));
      
    }
    
}
