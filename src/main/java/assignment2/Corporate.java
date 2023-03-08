package assignment2;

public class Corporate extends Customer{
    private String country;
    private String taxID;
    

    
    public Corporate(int id, String name, int discountRate,String country, String taxID) {
        super(id, name, discountRate);
        this.country = country;
        this.taxID = taxID;
    }



    @Override
    public String generateReport() {
        return String.format("Corporate: Name:%s ID: %d Discount Rate:%d % Country:%s Tax ID: %s ",this.getName(),this.getId()
        ,this.getDiscountRate(), country, taxID);
    }

    

}
