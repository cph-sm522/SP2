package SP2;

public class GasolineCar extends AFuelCar {
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPerLitre = kmPrLitre();
        if (kmPerLitre >= 20 && kmPerLitre <= 50) {
            return 330;
        } else if (kmPerLitre >= 15 && kmPerLitre < 20) {
            return 1050;
        } else if (kmPerLitre >= 10 && kmPerLitre < 15) {
            return 2340;
        } else if (kmPerLitre >= 5 && kmPerLitre < 10) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "GasolineCar [RegistrationNumber=" + getRegistrationNumber() +
                ", Make=" + getMake() + ", Model=" + getModel() +
                ", Doors=" + getNumberOfDoors() + ", FuelType=" + getFuelType() +
                ", RegistrationFee=" + getRegistrationFee() + "]";
    }
}

