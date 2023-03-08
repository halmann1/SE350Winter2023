package assignment4.problem;

abstract class DisDecorator implements handlerInterface{
    protected handlerInterface handler;

    public DisDecorator(handlerInterface handler){
        this.handler = handler;
    }

    public void handle(Double distance, String unit){
        handler.handle(distance, unit);
    }


}
