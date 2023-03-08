package assignment4.problem;

public interface handlerInterface {

     void setNext(handlerInterface handler);
     
     void handle(Double distance, String unit);
}
