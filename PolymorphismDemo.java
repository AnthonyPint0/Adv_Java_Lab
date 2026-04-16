// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading (Compile-time polymorphism)
    void eat() {
        System.out.println("Animal eats food");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

// Subclass inheriting Animal
class Dog extends Animal {
    // Method Overriding (Run-time polymorphism)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Inheritance
        Dog d = new Dog();
        // Method Overriding (Run-time polymorphism)
        d.sound();
        // Method Overloading (Compile-time polymorphism)
        d.eat();
        d.eat("meat");
        // Run-time polymorphism using superclass reference
        Animal a = new Dog();
        a.sound();
    }
}