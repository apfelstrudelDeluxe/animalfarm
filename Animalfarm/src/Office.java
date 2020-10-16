public class Office extends Employee {

private CoffeeCard coffeeCard;
private KeyCard keyCard;
private int parkingSpot;

   public Office(String firstName, String secondName, int svn, Location location, String sex, int salary, Address address, CoffeeCard coffeeCard, KeyCard keyCard, int parkingSpot) {
      super(firstName, secondName, svn, location, sex, salary, address);
      this.coffeeCard = coffeeCard;
      this.keyCard = keyCard;
      this.parkingSpot = parkingSpot;
   }
}



