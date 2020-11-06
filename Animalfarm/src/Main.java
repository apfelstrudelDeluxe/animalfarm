import controller.EmployeeManagement;
import model.Address;
import model.Employee;
import model.Location;

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

        switch (input) {
            case 1:
                System.out.println("");
            case 2:
                System.out.println();
            case 3:
                System.out.println("");
            default:
                System.out.println("falsche Eingabe! ;)");
                break;

        }
    }

    private static void setup() {
        Address linz = new Address("Linz", 4020, "124", "Unionstraße", "Austria");
        Address wels = new Address("Wels", 4600, "3", "Kaiser Franz Joseph Platz", "Austria");
        Address officeAddress = new Address("Linz", 4020, "13B", "Peter-Behrens Platz", "Austria");
        Address shopAddress = new Address("Linz", 4040, "42", "Hauptstraße", "Austria");

        Location office = new Location(officeAddress);
        Location shop = new Location(shopAddress);

        employees.add(new Employee("Franz", "Huber", 758945, linz, "male", 1500, office));
        employees.add(new Employee("Helga", "Mair", 745645, linz, "male", 1500, office));
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
