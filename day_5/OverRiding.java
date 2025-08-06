package day_5;
//Can we override private method, constructor, static method, final method? Illustrate with an example.


class Animal {
    // Final method - cannot be overridden
    public final void eat() {
        System.out.println("Animal eats food");
    }

    // Static method - cannot be overridden (only hidden)
    public static void staticMethod() {
        System.out.println("Animal's static method");
    }

    // Private method - not inherited, cannot be overridden
    private void privateMethod() {
        System.out.println("Animal's private method");
    }

    // Normal method - can be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    // Constructor
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    // Trying to override eat() would cause error since it's final
    // public void eat() { } // ❌ ERROR

    // Hides static method
    public static void staticMethod() {
        System.out.println("Dog's static method");
    }

    // This is NOT overriding the private method
    public void privateMethod() {
        System.out.println("Dog's method with same name as private method");
    }

    // Overriding sound()
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    Dog() {
        System.out.println("Dog constructor");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    Cat() {
        System.out.println("Cat constructor");
    }
}

class Puppy extends Dog {
    @Override
    public void sound() {
        System.out.println("Puppy yaps");
    }

    Puppy() {
        System.out.println("Puppy constructor");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        System.out.println("=== Dog Object ===");
        Animal dog = new Dog();
        dog.sound();         // Dog barks
        dog.eat();           // Animal eats food (final)
        Animal.staticMethod(); // Animal's static method
        Dog.staticMethod();    // Dog's static method (hidden)

        System.out.println("\n=== Cat Object ===");
        Animal cat = new Cat();
        cat.sound();         // Cat meows
        cat.eat();           // Animal eats food

        System.out.println("\n=== Puppy Object ===");
        Animal puppy = new Puppy();
        puppy.sound();       // Puppy yaps
        puppy.eat();         // Animal eats food

        System.out.println("\n=== Static method via object reference ===");
        puppy.staticMethod(); // Still calls Dog's static method if accessed via Dog
    }
}
