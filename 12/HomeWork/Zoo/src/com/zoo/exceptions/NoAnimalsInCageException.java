package com.zoo.exceptions;

public class NoAnimalsInCageException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3035735012619925932L;

	public NoAnimalsInCageException() {
		super("Животных в вольере нет.");
	}

}
