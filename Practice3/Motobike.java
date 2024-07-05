package Practice3;

public class Motobike extends Vehicle {
    private double capacity;

    public Motobike(String number, String manufacturer, int manufactureYear, String color, VehicleOwner owner,
            double capacity) {
        super(number, manufacturer, manufactureYear, color, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
