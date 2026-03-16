class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class java4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.eat("meat");

        Animal a = new Dog();
        a.sound();
    }
}
