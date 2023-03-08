package assignment2;

public  class Vehicle {

    private int vehicleID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private VehicleType type;
    private boolean available;
    private int dailyRate;


    public Vehicle(int vehicleID, String make, String model, int year, int mileage, VehicleType type,int dailyRate) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.type = type;
        this.dailyRate = dailyRate;
        this.available = true;
    }
    public int getVehicleID() {
        return vehicleID;
    }
    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public VehicleType getType() {
        return type;
    }
    public void setType(VehicleType typeGiven) {
        this.type = typeGiven;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public int getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleID=" + vehicleID + ", make=" + make + ", model=" + model + ", year=" + year
                + ", mileage=" + mileage + ", available=" + available + ", dailyRate=" + dailyRate + "]";
    }



}
