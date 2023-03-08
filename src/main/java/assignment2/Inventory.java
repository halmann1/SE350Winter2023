package assignment2;

import java.util.ArrayList;

public class Inventory implements Reportable {
    private int inventoryID;
    private VehicleType type;
    private ArrayList<Vehicle> vehicles;

    public Inventory(int inventoryID, VehicleType type) {
        this.inventoryID = inventoryID;
        this.type = type;
        vehicles = new ArrayList<Vehicle>();
    }
    public void addVehicle(Vehicle vGiven){
        if (vGiven.getType() == this.type) {
            vehicles.add(vGiven);
        }else{
            System.out.println("Not the same type");
        }
    }
    public void removeVehicle(Vehicle vGiven){
        vehicles.remove(vGiven);
    }
    public int getInventoryID() {
        return inventoryID;
    }
    public VehicleType getType() {
        return type;
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    @Override
    public String generateReport() {
        String s = new String();
        s = s + String.format("\nInventory Type:%s\nInventory ID:%d\n",
         this.type,this.inventoryID);
        for (Vehicle v: vehicles){
            s = s + v.toString();
        }
        s += "\n";
        return s;
    }

    
}
