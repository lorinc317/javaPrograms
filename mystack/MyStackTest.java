package mystack;

public class MyStackTest {

public static void main(String[] args) {
    MyStack<Integer> e = new MyStack<Integer>(10); 
      for(int i = 0; i < 10; i++){
          e.push( Integer.valueOf(i*10));
      }
      Integer val;
      System.out.println("Integer type");
      while(!e.isEmpty()) {
          val = (Integer) e.pop();
         System.out.println(val);
      }
    
    MyStack<Double> d = new MyStack<Double>(10); 
      for(int i = 0; i < 10; i++){
          d.push( Double.valueOf(i*10));
      }
      
      System.out.println("Double type");
      while(!d.isEmpty()) {
         Double value = (Double) d.pop();
         System.out.println(value);
      }
      
      
      
      
   }
    
}
