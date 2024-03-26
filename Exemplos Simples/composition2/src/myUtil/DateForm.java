package myUtil;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateForm {

    public static String showMessage() {
        return JOptionPane.showInputDialog(null, "Informe a data");
    }
    public static DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate setDate() {
        return LocalDate.parse(showMessage(), formate);
    }
}
