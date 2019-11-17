package com.zoo.exceptions;

public class NoCageException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1442678204496357359L;

	public NoCageException() {
		super("Свободных вольеров в зоопарке нет.");
	}

}
