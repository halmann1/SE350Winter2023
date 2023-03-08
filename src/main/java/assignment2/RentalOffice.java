package assignment2;

import java.util.ArrayList;

public class RentalOffice implements Reportable{
    private int officeID;
    private String locationZip;
    private ArrayList<Inventory> inventories;
    private ArrayList<RentalOrder> rentalOrders;

    public RentalOffice(int officeID, String locationZip) {
        this.officeID = officeID;
        this.locationZip = locationZip;
        inventories = new ArrayList<Inventory>();
        rentalOrders = new ArrayList<RentalOrder>();
    }

    public void addInventory (Inventory givenInv){
        boolean found = false;
        for (int i = 0; i < inventories.size();i++){
            if (inventories.get(i).getType() == givenInv.getType()){
                found = true;
            }
        }
        if (!found){
            inventories.add(givenInv);
        }
    }

    public void removeInventory (Inventory givenInv){
        inventories.remove(givenInv);
    }

    public void addOrder(RentalOrder givenOrder){
        rentalOrders.add(givenOrder);
    }

    public String generateReport(){
        String s = String.format("\nRental Office \nID:%d \nLocation Zipcode:%s\n\nList of Inventories\n\n",this.officeID,this.locationZip);
        
        for (Inventory n:inventories){//concatenate the inventories (including their vehicles)
            s= s+n.generateReport();
        }
        s = s+ "\nList of orders\n\n";//concatenate the orders' history
        for (RentalOrder r: rentalOrders){
            s = s + r.generateReport();
        }
        return s;
    }




}
