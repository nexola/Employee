package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Function to clear the console
    public static void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Instancing an object to collect all employees
        Employee generalEmployee = new Employee();

        System.out.print("How many employees? ");
        int numberOfEmployees = sc.nextInt();

        // Fori collecting employees
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("\nEmployee #%d", i+1);
            // If outsourced, user needs to provide one more value (Additional charge)
            System.out.print("\nOutsourced? ");
            String outsourced = sc.next();
            if (outsourced.equals("y") || outsourced.equals("Y")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Worked hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: $");
                Double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                generalEmployee.addEmployee(employee);
                clear();
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Worked hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: $");
                Double valuePerHour = sc.nextDouble();
                Employee employee = new Employee(name, hours, valuePerHour);
                generalEmployee.addEmployee(employee);
                clear();
            }
        }
        clear();
        System.out.println(generalEmployee);
        sc.close();
    }
}
