package inheritance;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class Example1 {
    public class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog("Buddy", 5, "Husky");
    
            // Call inherited method
            myDog.displayInfo();

            // Call overridden method
            myDog.makeSound();

            // Call method from subclass
            myDog.displayBreed();
        }
    }
}
