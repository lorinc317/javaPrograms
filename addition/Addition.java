package addition;

import java.util.Scanner; 

public class Addition {
 
    public static void main( String[] args ){
    
        Scanner input = new Scanner( System.in );
        int number1; 
        int number2; 
        int sum; 

        System.out.print( "Enter first integer: " ); 
        number1 = input.nextInt(); 

        System.out.print( "Enter second integer: " ); 
        number2 = input.nextInt(); 
        
        sum = number1 + number2; 
        System.out.printf( "Sum is %d\n", sum ); 
        
        
        double num1; 
        double num2; 
        double sum2; 

        System.out.print( "Enter first double: " ); 
        num1 = input.nextDouble(); 

        System.out.print( "Enter second double: " ); 
        num2 = input.nextDouble(); 
        
        sum2 = num1 + num2; 
        System.out.printf( "Sum is %fl\n", sum2 ); 
        
        } 
} 