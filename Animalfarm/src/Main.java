import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hallo.Welcher Benutzer bist du bzw. was möchtest du tun?");
        System.out.println("1. für Office-Mitarbeiter");
        System.out.println("2. für Boss");
        System.out.println("3. Auswahl Coffee Card");
        int scanner = new Scanner (System.in).nextInt();

        switch (scanner) {
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

}
