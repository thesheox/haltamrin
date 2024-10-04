package course_2.polymorphism;

// Usage:
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Polymorphism: Dog is an Animal
        myAnimal.sound();             // Output: Dog barks

        myAnimal = new Cat();         // Polymorphism: Cat is an Animal
        myAnimal.sound();             // Output: Cat meows
    }
}
