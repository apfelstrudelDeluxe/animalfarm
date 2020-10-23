package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagement {
    private final List<Employee> employees;

    public EmployeeManagement() {

        this.employees = new ArrayList<>();

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

    public List<Employee> getEmployees() {
        return employees;
    }
}
