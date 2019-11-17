package com.zoo.exceptions;

public class CageIsFilledException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7829997073370343744L;

	public CageIsFilledException() {
		super("Вольер занят!");
	}

}
