package SP2;

public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar car1 = new GasolineCar("ABC123", "Audi", "A6", 4, 25);
        DieselCar car2 = new DieselCar("XYZ789", "BMW", "X5", 5, 18, true);
        ElectricCar car3 = new ElectricCar("EFG456", "Tesla", "Model S", 4, 80, 350);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);
        System.out.println("Total Registration Fee for Fleet: " + fleet.getTotalRegistrationFeeForFleet() + " kr");
    }
}
