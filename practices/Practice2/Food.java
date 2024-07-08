package Practice2;

import java.time.LocalDate;

public class Food extends Goods {
    private LocalDate manufactureDate;
    private LocalDate expirationDate;

    public Food(String code, String name, int quantity, double price, LocalDate manufactureDate,
            LocalDate expirationDate) {
        super(code, name, quantity, price, 0.05);
        check(manufactureDate, expirationDate);
        this.manufactureDate = manufactureDate;
        this.expirationDate = expirationDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        check(manufactureDate, this.expirationDate);
        this.manufactureDate = manufactureDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        check(this.manufactureDate, expirationDate);
        this.expirationDate = expirationDate;
    }

    private void check(LocalDate manufactureDate, LocalDate expirationDate) {
        if (expirationDate.isBefore(manufactureDate)) {
            throw new IllegalArgumentException("Expiration date must be after manufacture date!");
        }
    }

    @Override
    public String measureConsumption() {
        return (inventoryQuantity > 0 && expirationDate.isBefore(LocalDate.now())) ? "Hard to sell" : "";
    }

    @Override
    public String toString() {
        return "FOOD ===> ";
    }
}
