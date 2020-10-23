package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {

        this.employees = new ArrayList<>();

    }

    private void setUp() {

        employees.add(new Employee("Franz", "Huber", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Helga", "Mair", 745645, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Daniel", "Hofer", 858945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Susi", "MussDarf", 758943, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Elfi", "Bauer", 758995, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Udo", "Lindner", 158945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Max", "Mustermann", 768945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("John", "Doe", 752945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Ida", "Pfeifer", 458945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Mustafa", "MussDann", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Bin", "Laden", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("Ali", "Alf", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));
        employees.add(new Employee("An", "Ette", 758945, new Location("Hauptplatz", "Linz", 4020, "Austria" ), "male", 1500, new Address(" ")));




    }

    public static void main(String[] args) {
        EmployeeManagement empList = new EmployeeManagement();

        System.out.println(empList.employees);

    }

    public Employee getEmp(int svn) {

        for (Employee e : employees) {
            if (e.getSvn() == svn) {
                return e;
            }
        }

        return null;

    }

    public double revSum() {

        double rev = 0;
        for (Employee e : employees) {
           if (e instanceof Cashier) {
            rev += ((Cashier) e).getRevenue();
           }
        }

        return rev;

    }

    public boolean deleteEmp(int svn) {

        Employee e = getEmp(svn);
        if (e == null) {
            return false;
        }
        return employees.remove(e);
    }

    public boolean addEmp(Employee e) {

        return employees.add(e);

    }


    public List<String> getLic (Employee e) {

        if(e instanceof Warehouse){

            return ((Warehouse) e).getLicenses();

        }

        return null;
    }


    public double getRev (Employee e) {

        if(e instanceof Cashier){

          return ((Cashier) e).getRevenue();

        }

        return -1;
    }

    public double getBoni (Employee e) {

        if(e instanceof Warehouse){

            return  ((Warehouse) e).getBonus();


        }

        return -1;
    }



}
