// Parent class
class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

// Child class overriding display()
class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}

// Main class to test overriding
public class method_overriding_by_creating_parent_and_child_classes_with_the_same_method_signature {
    public static void main(String[] args) {

        // Parent class object
        Parent p = new Parent();
        p.display();  // Calls parent class method

        // Child class object
        Child c = new Child();
        c.display();  // Calls overridden method in child class


    }
}
