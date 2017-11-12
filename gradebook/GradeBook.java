package gradebook;

import java.util.Scanner;
public class GradeBook
{
       private String courseName; 

       public void setCourseName( String name )
        {
            courseName = name; 
        } 

        public String getCourseName()
        {
            return courseName;
        }
    
        public  void displayMessage(){ 
        System.out.printf( "Welcome to the grade book for\n%s!\n",
    getCourseName() );
        }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        GradeBook gb = new GradeBook();
        System.out.println( "Please enter the course name:" );
        String nameOfCourse = input.nextLine(); 
        System.out.println(); 
        gb.setCourseName(nameOfCourse);
        gb.displayMessage();
    }
} 