package day_1;
//Write a program to check whether the object is an instance of a particular class?


class Animal {
}

class Dog extends Animal {
}

public class InstanceCheck {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        if (a instanceof Animal) {
            System.out.println("Object 'a' is an instance of Animal");
        }

        if (d instanceof Dog) {
            System.out.println("Object 'd' is an instance of Dog");
        }

        if (d instanceof Animal) {
            System.out.println("Object 'd' is also an instance of Animal");
        }

        if (a instanceof Dog) {
            System.out.println("Object 'a' is an instance of Dog");
        } else {
            System.out.println("Object 'a' is NOT an instance of Dog");
        }
    }
}
