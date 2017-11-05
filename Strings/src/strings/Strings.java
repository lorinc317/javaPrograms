package strings;

import java.util.Stack;
import java.util.StringTokenizer;

public class Strings {

    public static String reverse(String input){
    char[] in = input.toCharArray();
    int begin=0;
    int end=in.length-1;
    char temp;
    while(end>begin){
        temp = in[begin];
        in[begin]=in[end];
        in[end] = temp;
        end--;
        begin++;
    }
    return new String(in);
}
    
 public static String reverseIt(String source) {
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }

    return dest.toString();
}   
    
public static void reverseStringByWords(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] words = string.split(" ");

    for (int j = words.length-1; j >= 0; j--) {
        stringBuilder.append(words[j]).append(' ');
    }
    System.out.println("Reverse words: " + stringBuilder);
}

public static void reverseByCharacters(String str)
{
    String result="";
    for (int i=str.length()-1; i>=0; i--) {
        result = result + str.charAt(i);
    }
    System.out.println(result);
}
    
public String reverseString(String s) {
    Stack<Character> stack = new Stack<Character>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        stack.push(s.charAt(i));
    }
    while (!stack.empty()) {
        sb.append(stack.pop());
    }
    return sb.toString();

}

public static String revWordsStack(String str)
{
Stack<String> myStack = new Stack<>();
StringTokenizer st = new StringTokenizer(str);
StringBuilder sb = new StringBuilder();
while (st.hasMoreTokens()) {
     myStack.push(st.nextToken());
}

while (!myStack.empty()) {
  sb.append(myStack.pop());
  sb.append(" ");
}
return sb.toString();
}

    public static void main(String[] args) {
        String str = "alma";
        String str2 = "alma";
        String str3 = str2;
        
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.compareTo(str2));
        System.out.println(str2 == str3);
        
        System.out.println("alma"==str);
        System.out.println("alma".charAt(0));
        System.out.println("alma".toCharArray()[2]);
        
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloString );
      
      String palindrome = "Dot saw I was Tod";
      int len = palindrome.length();
      System.out.println( "String Length is : " + len );
     
      System.out.println(revWordsStack(palindrome));
    String string1 = "saw I was ";
      System.out.println("Dot " + string1 + "Tod");
    
      float floatVar = (float) 13.0;
      int intVar = 1243;
      String stringVar = "str";
      System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %05d, and the string " +
                  "is %s\n", floatVar, intVar, stringVar);
      
      String fs;
fs = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", floatVar, intVar, stringVar);
System.out.println(fs);

String s = "Strings are immutable";
      char result = s.charAt(8);
      System.out.println(result);

      String str11 = "Strings are immutable";
      String str12 = new String("Strings are immutable");
      String str13 = new String("Integers are not immutable");
      
      int result1 = str11.compareTo( str12 );
      System.out.println(result1);
      
      result1 = str12.compareTo( str13 );
      System.out.println(result1);
      
      result1 = str13.compareTo( str12 );
      System.out.println(result1);
       str11 = "Strings are immutable";
       str12 = "StringS ARE immutable";
       result1 = str11.compareToIgnoreCase( str12 );
      System.out.println(result1);

      result1 = str12.compareToIgnoreCase( str13 );
      System.out.println(result1);

      result1 = str3.compareToIgnoreCase( str11 );
      System.out.println(result1);
      
      String s1 = "Strings are immutable";
      s1 = s1.concat(" all the time");
      System.out.println(s1);
      
      String str10 = "Not immutable";
      String str21 = "Strings are immutable";
      StringBuffer str31 = new StringBuffer( "Not immutable");

      boolean  result0 = str10.contentEquals( str31 );
      System.out.println(result0);
	  
      result0 = str21.contentEquals( str31 );
      System.out.println(result0);
      
      char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
      String Str2 = "";
      Str2 = String.copyValueOf( Str1 );
      System.out.println("Returned String: " + Str2);

      Str2 = String.copyValueOf( Str1, 2, 6 ); /* offset */
      System.out.println("Returned String: " + Str2);
      
      String Str01 = new String("This is really not immutable!!");
      String Str02 = Str01;
      String Str03 = new String("This is really not immutable!!");
      String Str04 = new String("This IS REALLY NOT IMMUTABLE!!");
      boolean retVal0;

      retVal0 = Str01.equals( Str02 );
      System.out.println("Returned Value = " + retVal0 );

      retVal0 = Str01.equals( Str03 );
      System.out.println("Returned Value = " + retVal0 );

      retVal0 = Str01.equalsIgnoreCase( Str04 );
      System.out.println("Returned Value = " + retVal0 );
      
      System.out.println("Hashcode for Str01 :" + Str01.hashCode() );
      System.out.println("Hashcode for Str04 :" + Str04.hashCode() );
      
      String Str = new String("Welcome-to-Tutorialspoint.--com");
      System.out.println("Return Value :" );      
      
      for (String retval: Str.split("-")) {
         System.out.println(retval);
      }
      
      Str = new String("   \t  \n Welcome to Tutorialspoint.com   ");

      System.out.print("Return Value :" );
      System.out.println(Str.trim() );
    }
    
}
