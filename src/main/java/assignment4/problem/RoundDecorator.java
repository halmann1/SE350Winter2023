package assignment4.problem;

public class RoundDecorator extends DisDecorator{

    public RoundDecorator(handlerInterface handler) {
        super(handler);
    }

    @Override
    public void setNext(handlerInterface handler) {
        this.handler.setNext(handler);
    }

    @Override
    public void handle(Double distance, String unit) {
        super.handle(distance, unit);
        Client.ansDistance = String.format("%.2f", Double.valueOf(Client.ansDistance));
    }
    
}
