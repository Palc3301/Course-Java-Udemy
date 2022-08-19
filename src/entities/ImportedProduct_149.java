package entities;

public class ImportedProduct_149 extends Product_149 {

    private  Double customsFee;

    public ImportedProduct_149() {
        super();
    }

    public ImportedProduct_149(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public void totalPrice(double price) {

    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String toString() {
        return getName()
                + " $ " + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee) + ")";
    }
}
