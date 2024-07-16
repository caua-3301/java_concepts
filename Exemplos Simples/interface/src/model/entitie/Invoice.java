package model.entitie;

public class Invoice {
    private double basicPayment;
    private double tax;
    private double totalPayment;

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
        this.totalPayment = 0;
    }

    public double calculatePayment() {
        return getBasicPayment() + getTax();
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPayment() {
        return this.totalPayment;
    }
}
