package work;

import java.util.ArrayList;
import department.Departament;
import contract.HourContract;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private double baseSalary;

    private Departament departamento;

    private List<HourContract> contratos = new ArrayList<>();

    public Worker(String name, WorkLevel level, double baseSalary, Departament departamento) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departament departamento) {
        this.departamento = departamento;
    }

    public List<HourContract> getContratos() {
        return contratos;
    }

    public void addContract(HourContract contract) {
        contratos.add(contract);
    }

    public void removeContract(HourContract contract) {
        contratos.remove(contract);
    }

    //soma dos contratos mais o salário base (mensal e fixo)
    public double income(int ano, int mes) {
        double soma = 0.0;

        //desnecessario, mas praticando iteracoes com stream e seus metodos
        List<HourContract> mesReferente = contratos.stream().filter(contract -> contract.getData().getYear() == ano).toList();

        //pegando o resultado do filtro
        for (HourContract item : mesReferente ) {
            soma += item.totalValue() + baseSalary;
        }

        return soma;
    }
}
