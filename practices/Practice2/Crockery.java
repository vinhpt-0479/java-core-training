package Practice2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Crockery extends Goods {
    private String manufacturerInfo;
    private LocalDate arrivalDate;

    public Crockery(String code, String name, int quantity, double price, String manufacturerInfo,
            LocalDate arrivalDate) {
        super(code, name, quantity, price, 0.1);
        this.manufacturerInfo = manufacturerInfo;
        this.arrivalDate = arrivalDate;
    }

    public String getManufacturerInfo() {
        return manufacturerInfo;
    }

    public void setManufacturerInfo(String manufacturerInfo) {
        this.manufacturerInfo = manufacturerInfo;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Override
    public String measureConsumption() {
        return inventoryQuantity > 50 && ChronoUnit.DAYS.between(arrivalDate, arrivalDate) > 10 ? "Slow sale" : "";
    }

    @Override
    public String toString() {
        return "CROCKERY ===> ";
    }
}
