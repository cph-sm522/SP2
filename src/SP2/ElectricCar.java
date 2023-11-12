package SP2;

public class ElectricCar extends ACar {
    private double batteryCapacityKWh;
    private double maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacityKWh, double maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public double getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public double getMaxRangeKm() {
        return maxRangeKm;
    }

    public double getWhPrKm() {
        return (batteryCapacityKWh * 1000) / maxRangeKm;
    }

    @Override
    public int getRegistrationFee() {
        // Omregner fra Wh/km til km/l
        double kmPerLitre = 100 / (getWhPrKm() / 91.25);

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
        return "ElectricCar [RegistrationNumber=" + getRegistrationNumber() +
                ", Make=" + getMake() + ", Model=" + getModel() +
                ", Doors=" + getNumberOfDoors() +
                ", BatteryCapacity=" + getBatteryCapacityKWh() + " kWh" +
                ", MaxRange=" + getMaxRangeKm() + " km" +
                ", RegistrationFee=" + getRegistrationFee() + "]";
    }
}