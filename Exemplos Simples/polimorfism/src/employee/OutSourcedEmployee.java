package employee;

public class OutSourcedEmployee extends Employee{
    private double additionalCharge;

    public OutSourcedEmployee(String name, int hours, double valuerPerHour, double additionalCharge) {
        super(name, hours, valuerPerHour);
        this.additionalCharge = additionalCharge;
    }

    //ensuring that class don't will be override
    @Override
    public final double payment() {
        return super.payment() + additionalCharge*1.1;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
