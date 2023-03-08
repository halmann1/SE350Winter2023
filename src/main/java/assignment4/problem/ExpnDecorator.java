package assignment4.problem;

public class ExpnDecorator extends DisDecorator{

    public ExpnDecorator(handlerInterface handler) {
        super(handler);
    }

    @Override
    public void setNext(handlerInterface handler) {
        this.handler.setNext(handler);
    }

    @Override
    public void handle(Double distance, String unit) {
        super.handle(distance, unit);
        Client.ansDistance = String.format(" %.2e", Double.valueOf(Client.ansDistance));
    }

    
    
}
