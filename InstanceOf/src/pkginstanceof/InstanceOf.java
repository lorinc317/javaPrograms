package pkginstanceof;

public class InstanceOf {

    public static void main(String[] args) {
        Animal a = new Dog("dog");
        Dog d = new Dog("kutya");
        Animal p = new Puppy("puppy");
        Dog dp = new Puppy("alma");
        Puppy pp = new Puppy("korte");
        
        if(a instanceof Animal)
        {
            System.out.println("the dog is animal");
        }
        if(d instanceof Dog)
        {
            System.out.println("the dog is dog");
        }
        
        if(p instanceof Animal)
        {
            System.out.println("the puppy is animal");
        }
        
        if(dp instanceof Dog)
        {
            System.out.println("the puppy is dog");
        }
        
    }

}

abstract class Animal {

    String name;
    public Animal(String n)
    {
        this.name = n;
        System.out.println("Animal constuctor: " + name);
    }
}

class Dog extends Animal {

    public Dog(String n) {
        super(n);
    }

}

class Puppy extends Dog{

    public Puppy(String n) {
        super(n);
    }
}
class Cat extends Animal {

    public Cat(String n) {
        super(n);
    }
}
