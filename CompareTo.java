public class CompareTo { 

   public static void main(String args[]) {
      Integer x = 5;
      
      System.out.println(x.compareTo(3)); /* 1 */
      System.out.println(x.compareTo(5)); /* 0 */
      System.out.println(x.compareTo(8)); /* -1 */           
   }
}