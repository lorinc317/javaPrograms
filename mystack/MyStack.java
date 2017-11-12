package mystack;

public class MyStack <T>{
    
   private int maxSize;
   private Object[] stackArray;
   private int top;
   
   public MyStack(int s){
      this.maxSize = s;
      this.stackArray = (T[]) new Object[maxSize];
      this.top = -1;
   }
   
   public void push(T data){
      stackArray[++top] = data;
   }
   
   public Object pop(){
      return stackArray[top--];
   }
   
   public Object peek() {
      return stackArray[top];
   }
   
   public boolean isEmpty() {
      return (top == -1);
   }
   
   public boolean isFull() {
      return (top == maxSize - 1);
   }
  
}