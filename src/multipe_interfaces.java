
// Flyable interface
interface Flyable {
    void fly();
}

// Swimmable interface
interface Swimmable {
    void swim();
}

// Duck class implementing both interfaces
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}

// Main class to test Duck behavior
public class multipe_interfaces {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}
