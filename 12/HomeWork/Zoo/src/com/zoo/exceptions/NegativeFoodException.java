package com.zoo.exceptions;

public class NegativeFoodException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2955419262058990233L;

	public NegativeFoodException() {
		super("Negative count of foods!");
	}
}