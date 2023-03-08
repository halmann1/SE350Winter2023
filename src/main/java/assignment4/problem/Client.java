/*
 *
 *  * Copyright (c) 2022.
 *  * Vahid Alizadeh
 *  * Object-oriented Software Development
 *  * DePaul University
 *
 */

package assignment4.problem;

public class Client {
	static String ansDistance;
	//TODO Here is where you implement the converter logic using the requested "patterns" (Chain of Responsibility, and Decorator)
	//TODO You can have a static method Convert(..) here
	//TODO static Convert(...) method?
	//takes two inputs and initiates the chain
	public static String convert(Double distance, String unit){
		
		handlerInterface mileHandler = new MileHandler();
		handlerInterface yardHandler = new YardHandler();
		handlerInterface footHandler = new footHandler();

		mileHandler.setNext(yardHandler);
		yardHandler.setNext(footHandler);

		//handlerInterface chain = new RoundDecorator(mileHandler); test

		//handlerInterface chain = new unitDecorator(new RoundDecorator(mileHandler)); test

		handlerInterface chain = new unitDecorator(new ExpnDecorator(new RoundDecorator(mileHandler)));
		
		chain.handle(distance, unit);


		return ansDistance;
	}

	//TODO In the method body you must setup your patterns like Instantiating Handlers and setSuccessors for the Chain of Responsibility
	//here we tie the chain

	//TODO and Decorators for the Decorator pattern

}
