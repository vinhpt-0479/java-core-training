public interface Vehicle {
    void startEngine();
    void stopEngine();
    void honk();
}

public abstract class AbstractVehicle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

public class Bike extends AbstractVehicle {
    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    public void honk() {
        System.out.println("Bike is honking.");
    }
}

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void honk() {
        System.out.println("Car is honking.");
    }
}