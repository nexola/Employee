package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;
    protected List<Employee> employees = new ArrayList<>();

    // Constructors
    public Employee() {}

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // Getters and setters
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

    public List<Employee> getEmployees() {
        return employees;
    }

    // Payment calculator
    public Double payment() {
        return hours * valuePerHour;
    }

    // Add and remove employee from the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // To string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PAYMENTS:\n");
        for (Employee employee: employees) {
            sb.append(employee.name).append(" - $ ").append(String.format("%.2f", employee.payment()));
            sb.append("\n");
        }
        return sb.toString();
    }
}
