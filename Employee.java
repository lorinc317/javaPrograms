import java.io.*;
public class Employee {

   private String name;
   private int age;
   private String designation;
   private double salary;

   public Employee(String name) {
      this.name = name;
   }

   public void empAge(int empAge) {
      age = empAge;
   }

   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}