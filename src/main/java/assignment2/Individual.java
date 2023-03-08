package assignment2;


public class Individual extends Customer{

    private int age;
    private String state;
    private String zip;

    public Individual(int id, String name, int discountRate, int age, String state, String zip) {
        super(id, name, discountRate);
        this.age = age;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String generateReport() {
        return String.format("Individual Customer Report\nID:%d\nName:%s\nAge:%d\nState:%s\nZipCode:%s\nDiscount Rate:%d ",this.getId()
        ,this.getName(),this.age,this.state,this.zip,this.getDiscountRate());
    }
}

