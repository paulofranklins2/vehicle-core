public class SemiTruck extends Transportation {
    private double cargoCapacity;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void attachTrailer() {
        System.out.println("Trailer attached to semi-truck.");
    }
}
