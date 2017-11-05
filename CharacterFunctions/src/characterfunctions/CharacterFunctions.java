
package characterfunctions;

public class CharacterFunctions {

    
    public static char lowerToUpper(char c)
    {
        if(Character.isLowerCase(c))
        {
            return Character.toUpperCase(c);
        }
        return c;
    }
    
    public static int lowerToUpper(int c)
    {
        if(Character.isLowerCase(c))
        {
            return Character.toUpperCase(c);
        }
        return c;
    }
    
    
    public static void main(String[] args) {
        
        boolean retVal = false;
        
        retVal = Character.isLetter(65); //true
        System.out.println(retVal);
        
        retVal = Character.isLetter('A'); //true
        System.out.println(retVal);
        
        retVal = Character.isLetter(32); //false
        System.out.println(retVal);
        
        if(Character.isLowerCase('A'))
        {
            System.out.println("\'A\' is lowercase");
        }
        else if(Character.isUpperCase('A'))
        {
            System.out.println("\'A\' is uppercase");
        }
        
        System.out.println(lowerToUpper(97));
        System.out.println((char)lowerToUpper(97));
        System.out.println(lowerToUpper('a'));
        
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
      
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));
        
        System.out.println(Character.isWhitespace('c'));
      System.out.println(Character.isWhitespace(' '));
      System.out.println(Character.isWhitespace('\n'));
      System.out.println(Character.isWhitespace('\t'));
      
      System.out.println(Character.isUpperCase('c'));
      System.out.println(Character.isUpperCase('C'));
      System.out.println(Character.isUpperCase('\n'));
      System.out.println(Character.isUpperCase('\t'));
      
      System.out.println(Character.isLowerCase('c'));
      System.out.println(Character.isLowerCase('C'));
      System.out.println(Character.isLowerCase('\n'));
      System.out.println(Character.isLowerCase('\t'));
      
      System.out.println(Character.toUpperCase('c'));
      System.out.println(Character.toUpperCase('C'));
      System.out.println(Character.toUpperCase('5'));
      
      System.out.println(Character.toLowerCase('c'));
      System.out.println(Character.toLowerCase('C'));
      
      System.out.println(Character.toString('c'));
      System.out.println(Character.toString('C'));
      
      
      
      
      
    }
    
}
