package com.zoo.exceptions;

public class ManyFoodException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3625895560187887295L;

	public ManyFoodException() {
		super("Too many foods!");
	}
}