package Practice2;

public class Electronics extends Goods {
    private int monthsWarrantyPeriod;
    private double capacityKw;

    public Electronics(String code, String name, int quantity, double price, int monthsWarrantyPeriod,
            double capacityKw) {
        super(code, name, quantity, price, 0.1);
        check(monthsWarrantyPeriod, capacityKw);
        this.monthsWarrantyPeriod = monthsWarrantyPeriod;
        this.capacityKw = capacityKw;
    }

    public int getMonthsWarrantyPeriod() {
        return monthsWarrantyPeriod;
    }

    public void setMonthsWarrantyPeriod(int monthsWarrantyPeriod) {
        check(monthsWarrantyPeriod, this.capacityKw);
        this.monthsWarrantyPeriod = monthsWarrantyPeriod;
    }

    public double getCapacityKw() {
        return capacityKw;
    }

    public void setCapacityKw(double capacityKw) {
        check(this.monthsWarrantyPeriod, capacityKw);
        this.capacityKw = capacityKw;
    }

    private void check(int monthsWarrantyPeriod, double capacityKw) {
        if (monthsWarrantyPeriod < 0) {
            throw new IllegalArgumentException("Months warranty period must be greater than or equals to 0!");
        }
        if (capacityKw < 0) {
            throw new IllegalArgumentException("Capacity KW must be greater than or equal to 0!");
        }
    }

    @Override
    public String measureConsumption() {
        return inventoryQuantity < 3 ? "Sold" : "";
    }

    @Override
    public String toString() {
        return "ELECTRONICS ===> ";
    }
}
