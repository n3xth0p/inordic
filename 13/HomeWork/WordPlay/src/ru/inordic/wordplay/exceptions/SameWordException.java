package ru.inordic.wordplay.exceptions;

public class SameWordException extends Exception {
	public SameWordException() {
		super("Такое слово уже было");
	}
}