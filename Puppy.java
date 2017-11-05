public class Puppy {
	private int age;
	private String name;
   public Puppy(String n {
      this.name = n;
      System.out.println("Name chosen is :" + n );
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getAge() {
      System.out.println("Puppy's age is :" + this.age );
      return this.age;
   }

   public static void main(String []args) {
      
      Puppy myPuppy = new Puppy( "tommy" );
      myPuppy.setAge(2);
      myPuppy.getAge();
   }
   
}