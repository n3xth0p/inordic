package ru.inordic.wordplay.exceptions;

public class InvalidInputException extends Exception {
	public InvalidInputException() {
		super("Неверный ввод");
	}
}