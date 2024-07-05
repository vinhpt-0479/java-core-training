package Practice3;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String number, String manufacturer, int manufactureYear, String color, VehicleOwner owner,
            double tonnage) {
        super(number, manufacturer, manufactureYear, color, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
}
