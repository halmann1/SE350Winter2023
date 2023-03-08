package assignment2;

import java.util.ArrayList;

public abstract class Customer implements Reportable {
    private int id;
    private String name;
    private int discountRate;
    private ArrayList<RentalOrder> rentalOrders;

    public Customer(int id, String name, int discountRate) {
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
        rentalOrders = new ArrayList<RentalOrder>();
    }

    public void addOrder(RentalOrder givenOrder){
        rentalOrders.add(givenOrder);
    }

    public void removeOrder(RentalOrder givenOrder){
        rentalOrders.remove(givenOrder);
    }

    public ArrayList<RentalOrder> getOrderHistory(){
        return rentalOrders;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscountRate() {
        return discountRate;
    }
    public ArrayList<RentalOrder> getRentalOrders() {
        return rentalOrders;
    }

    @Override
    public abstract String generateReport();

    
    
}
