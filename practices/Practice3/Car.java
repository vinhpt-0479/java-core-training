package Practice3;

public class Car extends Vehicle {
    private int numberOfSeat;
    private String engineType;

    public Car(String number, String manufacturer, int manufactureYear, String color, VehicleOwner owner,
            int numberOfSeat,
            String engineType) {
        super(number, manufacturer, manufactureYear, color, owner);
        this.numberOfSeat = numberOfSeat;
        this.engineType = engineType;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
