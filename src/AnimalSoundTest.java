// Base class Animal
class Animal {
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog overrides makeSound method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Subclass Cat overrides makeSound method
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

// Main class to test the polymorphism
public class AnimalSoundTest {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Dog object
        Animal cat = new Cat(); // Cat object

        dog.makeSound(); // Calls Dog's makeSound()
        cat.makeSound(); // Calls Cat's makeSound()
    }
}
