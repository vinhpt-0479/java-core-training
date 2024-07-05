package Practice3;

public class Vehicle {
    protected String number;
    protected String manufacturer;
    protected int manufactureYear;
    protected String color;
    protected VehicleOwner owner;

    public Vehicle(String number, String manufacturer, int manufactureYear, String color, VehicleOwner owner) {
        this.number = number;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleOwner getOwner() {
        return owner;
    }

    public void setOwner(VehicleOwner owner) {
        this.owner = owner;
    }
}
