package variables;

import java.io.*;

public class Variables{
	
	public void localVar()
	{
      int age = 0;
      age = age + 7;
      System.out.println("The value is : " + age);
	}
	
	public static void main(String args[]) {
      Employee empOne = new Employee("Ransika");
      empOne.setSalary(1000);
      empOne.printEmp();
	  
	  Variables v = new Variables();
	  v.localVar();
	  
	  System.out.println(Employee.DEPARTMENT + "salary is "+ Employee.dep_salary);
   }
}

 class Employee {
	 
	public static final String DEPARTMENT = "Development ";
	public static double dep_salary = 1000;
	 
   private String name;
   private double salary;

   public Employee (String empName) {
      name = empName;
   }

   public void setSalary(double empSal) {
      salary = empSal;
   }

   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

}