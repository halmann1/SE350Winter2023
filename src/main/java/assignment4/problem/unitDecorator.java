package assignment4.problem;

public class unitDecorator extends DisDecorator{

    public unitDecorator(handlerInterface handler) {
        super(handler);
    }

    @Override
    public void setNext(handlerInterface handler) {
        this.handler.setNext(handler);
    }

    @Override
    public void handle(Double distance, String unit) {
        super.handle(distance, unit);
        if (unit.matches("Foot")){
            Client.ansDistance = Client.ansDistance + " " + "Feet";
        }else{
        Client.ansDistance = Client.ansDistance + " " + unit + "s";
        }
    }
    
}
