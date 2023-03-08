package assignment4.problem;

public class footHandler implements handlerInterface{

    private handlerInterface chain;

    @Override
    public void setNext(handlerInterface handler) {
        this.chain = handler;
    }

    @Override
    public void handle(Double distance, String unit) {
        distance = distance * 3; //convert to mile 

        if (unit.equalsIgnoreCase("Foot")){ //if the user wants a mile output
            Client.ansDistance = String.valueOf(distance);
        }else{                                  //if the user wants any other unit
            chain.handle(distance, unit);
        }
    }

}
