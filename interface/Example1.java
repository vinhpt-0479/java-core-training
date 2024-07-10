interface Animal {
    void eat();
    void sleep();
}

// abstract class doesn't need to implement all method
abstract class AbstractAnimal implements Animal {
    @Override
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends AbstractAnimal {
    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}