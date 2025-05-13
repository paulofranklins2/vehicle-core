public class Car extends Transportation {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void playRadio() {
        System.out.println("Playing music on the car radio.");
    }
}
