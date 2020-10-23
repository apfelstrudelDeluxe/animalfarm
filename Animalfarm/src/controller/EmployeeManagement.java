package controller;

import model.Address;
import model.Employee;
import model.Location;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagement {
    private final List<Employee> employees;

    public EmployeeManagement() {

        this.employees = new ArrayList<>();
        employees.add(new Employee("Franz", "Huber", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Helga", "Mair", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Daniel", "Hofer", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));

    }

    public static void main(String[] args) {
        EmployeeManagement empList = new EmployeeManagement();

        System.out.println(empList.employees);

    }

    public Employee getEmp(String ID) {

        for (Employee e : employees) {
            if (e.getID().equals(ID)) {
                return e;
            }
        }

        return null;

    }

    public boolean deleteEmp(String ID) {

        Employee e = getEmp(ID);
        if (e == null) {
            return false;
        }
        return employees.remove(e);
    }

    public boolean addEmp(Employee e) {

        return employees.add(e);

    }



}
