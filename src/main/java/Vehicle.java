public class Transportation {
    private String vinNumber;
    private String licensePlate;
    private String licenseType;
    private int speed;
    private int capacity;
    private String fuelType;
    private String make;
    private String model;
    private double weight;
    private boolean hasGPS;
    private boolean engineType; // true = electric, false = combustion
    private int maxCapacity;
    private String color;
    private TerrainType terrain;
    private double fuelCapacity;
    private double speedometer;

    // Action methods
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void deAccelerate() {
        System.out.println("Decelerating...");
    }

    public void electronicBrake() {
        System.out.println("Electronic brake applied.");
    }

    // Getters and Setters
    public String getVinNumber() { return vinNumber; }
    public void setVinNumber(String vinNumber) { this.vinNumber = vinNumber; }

    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public String getLicenseType() { return licenseType; }
    public void setLicenseType(String licenseType) { this.licenseType = licenseType; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public boolean hasGps() { return hasGPS; }
    public void setGps(boolean hasGPS) { this.hasGPS = hasGPS; }

    public boolean isEngineType() { return engineType; }
    public void setEngineType(boolean engineType) { this.engineType = engineType; }

    public int getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public TerrainType getTerrain() { return terrain; }
    public void setTerrain(TerrainType terrain) { this.terrain = terrain; }

    public double getFuelCapacity() { return fuelCapacity; }
    public void setFuelCapacity(double fuelCapacity) { this.fuelCapacity = fuelCapacity; }

    public double getSpeedometer() { return speedometer; }
    public void setSpeedometer(double speedometer) { this.speedometer = speedometer; }
}
