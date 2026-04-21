package curso_nelio_alves_poo.enumeracao_composicao.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    List<HourContract> hourContractList;

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
        new ArrayList<HourContract>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void addContract(HourContract hourContract) {
        this.hourContractList.add(hourContract);
    }

    public void removeContract(HourContract hourContract) {
        this.hourContractList.remove(hourContract);
    }

    public Double income (Integer year, Integer month) {
        double sum = baseSalary;
        for (HourContract c : hourContractList) {
            if (year == c.getDate().getYear() && month == c.getDate().getMonthValue()) {
                sum += c.totalValue();
            }
        }
        return sum;
    }



}
