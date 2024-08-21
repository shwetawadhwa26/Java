
public class constructor {
    class Person {
    // Instance variables
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;  // 'this.name' refers to the instance variable, 'name' is the parameter
        this.age = age;    // 'this.age' refers to the instance variable, 'age' is the parameter
    }

    // Method to display the person's details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);5
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("Alice", 30);

        // Displaying the person's details using the display method
        person1.display();
    }
}


    
}
