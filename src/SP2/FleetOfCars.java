package SP2;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> carList = new ArrayList<>();

    // Tilføj en bil
    public void addCar(Car car) {
        carList.add(car);
    }

    //Beregner registreringsafgift for hele flåden
    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car car : carList) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fleet of Cars:\n");
        for (Car car : carList) {
            sb.append(car.toString()).append("\n");
        }
        return sb.toString();
    }
}
