package assignment2;

public class RentalOrder implements Reportable{
    private int totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;
    private RentalOffice office;

    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength,RentalOffice rOffice) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
        this.office = rOffice;

    }

    public RentalOrder(Customer customer, Vehicle vehicle, RentalOffice office) {
        this(customer,vehicle,1,office);
    }


    public int calculateTotalCost(){
        this.totalCost = this.vehicle.getDailyRate()* this.customer.getDiscountRate()*rentalLength;
        return totalCost;
    }

    public void completeOrder(){
        customer.addOrder(this);
        office.addOrder(this);
        vehicle.setAvailable(false);

    }

    @Override
    public String generateReport() {
        return String.format("Rental Order\nCustomer:%s\nCustomer ID:%d\nVehicle ID:%d\nVehicle make:%s\nVehicle Model:%s\nYear:%d\nRental Length:%d\ntotal:%d\n\n"
        ,customer.getName(),customer.getId(),vehicle.getVehicleID(),vehicle.getMake(),vehicle.getModel(),vehicle.getYear(),this.rentalLength,this.calculateTotalCost());
    }

}
