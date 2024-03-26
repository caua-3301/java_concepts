package contract;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {
    private LocalDate data;
    private double valuePerHour;
    private int hour;

    public HourContract(LocalDate data, double valuePerHour, int hour) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double totalValue() {
        return this.hour * this.valuePerHour;
    }
}
