package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;
    protected List<Employee> employees = new ArrayList<>();

    public Employee() {}

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return hours * valuePerHour;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Olá!").append(hours);
        return sb.toString();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
