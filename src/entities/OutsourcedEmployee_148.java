package entities;

public class OutsourcedEmployee_148 extends Employee_148{

    private Double addtionalCharge;

    public OutsourcedEmployee_148() {
        super();
    }

    public OutsourcedEmployee_148(String name, Integer hours, Double valuePerHour, double addtionalCharge){
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + addtionalCharge * 1.1;
    }


}
