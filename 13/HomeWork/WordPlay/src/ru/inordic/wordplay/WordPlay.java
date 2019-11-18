package ru.inordic.wordplay;

import java.util.ArrayList;
import java.util.Scanner;

import ru.inordic.wordplay.exceptions.*;

public class WordPlay {
	static int currentPlayer = 1;

	public static void checkContains(String text, String gameWord) throws InvalidInputException {
		for (int i = 0; i < text.length(); i++) {

			var symbol = text.charAt(i);
			var index = gameWord.indexOf(symbol);

			if (index < 0) {
				throw new InvalidInputException();
			}
		}
	}

	public static void checkHistory(ArrayList<String> historyPlayer1, ArrayList<String> historyPlayer2, String text)
			throws SameWordException {
		if (historyPlayer1.contains(text) || historyPlayer2.contains(text)) {
			throw new SameWordException();
		}

		if (currentPlayer % 2 == 1) {
			historyPlayer1.add(text);
		} else {
			historyPlayer2.add(text);
		}
	}

	public static void checkWinner(ArrayList<String> historyPlayer1, ArrayList<String> historyPlayer2) {
		if (historyPlayer1.size() > historyPlayer2.size()) {
			System.out.println("Игрок 1 выиграл");
		} else if (historyPlayer1.size() == historyPlayer2.size())
			System.out.println("Ничья");
		else
			System.out.println("Игрок 2 выиграл");
	}

	public static void nextPlayer() {
		if ((currentPlayer % 2) == 1) {
			System.out.println("Игрок 1 ходит: ");
		} else {
			System.out.println("Игрок 2 ходит: ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> historyPlayer1 = new ArrayList<String>();
		ArrayList<String> historyPlayer2 = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите игровое слово:");

		String gameWord = scanner.nextLine().toLowerCase();

		System.out.println("Ход Игрока 1: ");
		String text = scanner.nextLine();

		while (!"".equals(text)) {
			try {
				checkContains(text, gameWord);

				try {
					checkHistory(historyPlayer1, historyPlayer2, text);
				} catch (SameWordException e) {
					System.out.println("You enter same word again! 123");
					// оставляем того же игрока
					currentPlayer = (currentPlayer - 1) % 2;
				}

			} catch (InvalidInputException e) {
				System.out.println("Inconsist input!");
				// оставляем того же игрока
				currentPlayer = (currentPlayer - 1) % 2;
			}
			// переходим на второго игрока
			currentPlayer = (currentPlayer + 1) % 2;

			nextPlayer();
			text = scanner.nextLine();

		}

		System.out.println("Слова, Игрок 1: " + historyPlayer1 + ", всего слов: " + historyPlayer1.size());
		System.out.println("Слова, Игрок 2: " + historyPlayer2 + ", всего слов: " + historyPlayer2.size());

		checkWinner(historyPlayer1, historyPlayer2);

	}

}
