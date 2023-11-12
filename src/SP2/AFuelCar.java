package SP2;

public abstract class AFuelCar extends ACar {
    private final int kmPerLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }

    public int kmPrLitre(){
        return kmPerLitre;
    }

    public abstract String getFuelType();
}
