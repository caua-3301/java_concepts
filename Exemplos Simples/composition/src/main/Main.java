package main;

import work.Worker;
import department.Departament;
import contract.HourContract;
import work.WorkLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Departament departamentoSoft = new Departament("Desenvolvimento de software");

        Worker funcionario01 = new Worker("Cauã Pires", WorkLevel.SENIOR, 1000, departamentoSoft);

        /*data LocalDate = LocalDate.now();
        String texto = data.formato(formatador);
        LocalDate parsedDate = LocalDate.parse(texto, formatador);*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //aply
        HourContract contrato01 = new HourContract(LocalDate.parse("05/02/2024", formatter), 20, 5);
        HourContract contrato02 = new HourContract(LocalDate.parse("05/03/2023", formatter), 10, 2);

        funcionario01.addContract(contrato01);
        funcionario01.addContract(contrato02);

        System.out.println(funcionario01.income(2023, 3));
    }
}
