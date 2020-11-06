import controller.EmployeeManagement;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final EmployeeManagement employeeManagement = new EmployeeManagement();
    private static final List<Employee> employees = employeeManagement.getEmployees();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setup();
        System.out.println("Hallo.Welcher Benutzer bist du bzw. was möchtest du tun?");
        System.out.println("1. für Office-Mitarbeiter");
        System.out.println("2. für Boss");
        System.out.println("3. Auswahl Coffee Card");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Gute Wahl!");
                officeWorker();
                break;
            case 2:
                System.out.println();
            case 3:
                System.out.println("");
            default:
                System.out.println("falsche Eingabe! ;)");
                break;

        }
    }
    private static void officeWorker(){

       Employee employee =  getEmp();
        System.out.println(employee);

        System.out.println("Was möchtest du bei diesem Mitarbeiter machen?");
        System.out.println("1. Umsatz abfragen");
        System.out.println("2. Bonus abfragen");
        System.out.println("3. Führerschein abfragen");

        int sc = Integer.parseInt((scanner.nextLine()));
        switch (sc) {
            case 1:

                double rev = employeeManagement.getRev(employee);
                if (rev == -1) {
                    System.out.println("Ist kein Kassierer");
                } else {
                    System.out.println("Der Kassierer hat einen Umsatz von " + rev);
                }
                break;

            case 2:

                double boni = employeeManagement.getBoni((employee));
                if (boni == -1) {
                    System.out.println("Kein Lagermitarbeiter");
                } else {
                    System.out.println("Der Mitarbeiter hat einen Bonus von " + boni);
                }
                break;

            case 3:
                List<String> lic = employeeManagement.getLic(employee);
                if (lic == null) {
                    System.out.println("Hat keinen Führerschein");
                } else {
                    System.out.println("Der Mitarbeiter hat folgende Führerscheine " + lic);
                }
                break;
        }




    }

    private static Employee getEmp() {
        System.out.println("Bitte SVN von Mitarbeiter eingeben");
        int svn = Integer.parseInt(scanner.nextLine());
        Employee employee = employeeManagement.getEmp(svn);
        if (employee == null){
            System.out.println("Mitarbeiter mit der SVN " + svn + " nicht gefunden");

            getEmp();

        }
               return employee;
    }

    private static void setup() {
        Address linz = new Address("Linz", 4020, "124", "Unionstraße", "Austria");
        Address wels = new Address("Wels", 4600, "3", "Kaiser Franz Joseph Platz", "Austria");
        Address officeAddress = new Address("Linz", 4020, "13B", "Peter-Behrens Platz", "Austria");
        Address shopAddress = new Address("Linz", 4040, "42", "Hauptstraße", "Austria");

        Location office = new Location(officeAddress);
        Location shop = new Location(shopAddress);

        employees.add(new Warehouse("Franz", "Huber", 123, linz, "male", 1500, shop, 1500, new ArrayList<String>().add("A")));
        employees.add(new Cashier("Helga", "Mair", 456, linz, "male", 1500, shop, false, "GeldNehmen", "1A", 25000));
        employees.add(new Employee("Daniel", "Hofer", 858945, linz, "male", 1500, office));
        employees.add(new Employee("Susi", "MussDarf", 758943, linz, "male", 1500, office));
        employees.add(new Employee("Elfi", "Bauer", 758995, linz, "male", 1500, shop));
        employees.add(new Employee("Udo", "Lindner", 158945, linz, "male", 1500, shop));
        employees.add(new Employee("Max", "Mustermann", 768945, linz, "male", 1500, shop));
        employees.add(new Employee("John", "Doe", 752945, linz, "male", 1500, shop));
        employees.add(new Employee("Ida", "Pfeifer", 458945, wels, "male", 1500, office));
        employees.add(new Employee("Mustafa", "MussDann", 758945, wels, "male", 1500, office));
        employees.add(new Employee("Bin", "Laden", 758945, wels, "male", 1500, shop));
        employees.add(new Employee("Ali", "Alf", 758945, wels, "male", 1500, shop));
        employees.add(new Employee("An", "Ette", 758945, wels, "male", 1500, office));
    }



}
