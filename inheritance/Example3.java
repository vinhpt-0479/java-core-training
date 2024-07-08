package inheritance;


// Class cannot be inherited
final class Animal {
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

class Dog /*extends Animal*/ { // This will cause a compilation error

}

class Animal2 {
    String name;
    int age;

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal2 {

    public Cat(String name, int age) {
        super(name, age);
    }

    // This will cause a compilation error
    // @Override
    // public void makeSound() {
    //     // Method cannot be overridden
    // }
}
