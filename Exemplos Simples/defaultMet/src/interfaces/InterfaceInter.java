package interfaces;

public interface InterfaceInter {
    public double getInterestRate();
    default double payment(double amount, int time) {
        return amount * Math.pow((1 + getInterestRate()), time);
    }
}
