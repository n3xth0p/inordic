package ru.inordic.wordplay.exceptions;

public class ContainExceptions extends Exception {
	public ContainExceptions() {
		super("You enter same word again!");
	}
}