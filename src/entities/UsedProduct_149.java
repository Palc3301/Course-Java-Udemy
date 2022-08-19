package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct_149 extends Product_149 {

    private static final SimpleDateFormat sdf = new SimpleDateFormat();
    private Date manufactureDate;

    public UsedProduct_149() {
    }

    public UsedProduct_149(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date date) {

        this.manufactureDate = date;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}

