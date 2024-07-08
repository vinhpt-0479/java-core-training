package inheritance;

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class Example2 {
    public class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog("Buddy", 5);

            myDog.makeSound();
        }
    }
}
