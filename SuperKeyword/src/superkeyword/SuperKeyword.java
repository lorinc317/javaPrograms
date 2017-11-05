package superkeyword;

public class SuperKeyword {

    public static void main(String[] args) {
    SubClass s = new SubClass(0);
    s.myMethod();
    }

}

class SuperClass {

    int z;

    public SuperClass(int a) {
        this.z = a;
        System.out.println("Super class constructor: " + this.z);
    }
    
    public void display()
    {
        System.out.println("Super class method: " + this.z);
    }
}

class SubClass extends SuperClass{
    
    public SubClass(int a) {
        super(a);
    }
    
    @Override
    public void display()
    {
        System.out.println("Sub class method: " + this.z);
    }
    
    public void myMethod()
    {
        display();
        super.display();
    }
}