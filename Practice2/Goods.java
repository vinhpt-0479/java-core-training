package Practice2;

public abstract class Goods {
    public String code;
    public String name;
    public int inventoryQuantity;
    public double unitPrice;
    public double VAT;

    public Goods(String code, String name, int inventoryQuantity, double unitPrice, double VAT) {
        if (inventoryQuantity < 0)
            throw new IllegalArgumentException("Quantity must be greater than or equal to 0!");
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.VAT = VAT;
        this.inventoryQuantity = inventoryQuantity;
    }

    public abstract String measureConsumption();

    @Override
    public String toString() {
        return "GOODS ===>";
    }
}
