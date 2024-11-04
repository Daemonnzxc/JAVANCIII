abstract class abstractClass {
    abstract void abstractMethod();
    
    void concreteMethod() { // Concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    // Your code goes here
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Tasksheet127 {
    public static void main(String args[]) {
        B b = new B();
        b.abstractMethod(); // Calls B's implementation
        b.concreteMethod(); // Calls concrete method from abstract class
        
        C c = new C();
        c.abstractMethod(); // Calls C's implementation
        c.concreteMethod(); // Calls concrete method from abstract class
    }
}
