package SP2;

public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPerLitre = kmPrLitre();
        int registrationFee = 0;

        if (!hasParticleFilter()) {
            registrationFee += 1000;
        }

        if (kmPerLitre >= 20 && kmPerLitre <= 50) {
            registrationFee += 130;
        } else if (kmPerLitre >= 15 && kmPerLitre < 20) {
            registrationFee += 1390;
        } else if (kmPerLitre >= 10 && kmPerLitre < 15) {
            registrationFee += 1850;
        } else if (kmPerLitre >= 5 && kmPerLitre < 10) {
            registrationFee += 2770;
        } else {
            registrationFee += 15260;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return "DieselCar [RegistrationNumber=" + getRegistrationNumber() +
                ", Make=" + getMake() + ", Model=" + getModel() +
                ", Doors=" + getNumberOfDoors() + ", FuelType=" + getFuelType() +
                ", RegistrationFee=" + getRegistrationFee() + "]";
    }
}