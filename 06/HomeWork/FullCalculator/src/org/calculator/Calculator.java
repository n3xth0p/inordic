package org.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			// Calculator's text banner
			textBanner();

			// User input operation
			String operation = inputOperation(scanner);

			// calculator cycle
			while (!("exit".equals(operation))) {
				Long longA = inputFirstNumber(scanner);
				Long longB = inputSecondNumber(scanner, operation);
				calculateOperation(longA, longB, operation);
				operation = inputOperation(scanner);
			}

		}

		System.out.println("Всего доброго!");
	}

	private static void calculateOperation(Long longA, Long longB, String operation) {
		// TODO Auto-generated method stub
		switch (operation) {
		case "+":
			System.out.println("сумма: " + longA + " + " + longB + " = " + (longA + longB));
			break;

		case "-":
			System.out.println("разность: " + longA + " - " + longB + " = " + (longA - longB));
			break;

		case "*":
			System.out.println("умножение: " + longA + " * " + longB + " = " + (longA * longB));
			break;

		case "/":
			System.out.println("деление: " + longA + " / " + longB + " = " + ((double) longA / longB));
			break;

		case "div":
			System.out.println("целочисленное деление: " + longA + " div " + longB + " = " + (longA / longB));
			break;

		case "mod":
			System.out.println("деление по модулю: " + longA + " mod " + longB + " = " + (longA % longB));
			break;

		case "^":
			// возведение в степень
			Long degreeLongA = 1L;
			if (longB != 0) {
				for (int i = 0; i < longB; i++) {
					degreeLongA *= longA;
				}
			}
			System.out.println("степень - " + longA + " ^ " + longB + " = " + degreeLongA);
			break;

		default:
			// System.out.println("Просто выход по умолчанию из switch" );
			break;
		}

	}

	private static Long inputFirstNumber(Scanner scanner) {
		System.out.println("Введите 1е число: ");
		while (!scanner.hasNextLong()) {
			System.out.println("Неверный ввод, введите число:");
			scanner.next();
		}
		Long longA = scanner.nextLong();
		return longA;
	}

	private static Long inputSecondNumber(Scanner scanner, String operation) {
		System.out.println("Введите 2е число: ");
		Long longB;
		do {
			while (!scanner.hasNextLong()) {
				System.out.println("Неверный ввод, введите число:");
				scanner.next();
			}
			longB = scanner.nextLong();
			if (longB == 0 && ("/".equals(operation) || "mod".equals(operation) || "div".equals(operation))) {
				System.out.println("На ноль делить нельзя! Введите другое число:");
			}

		} while (longB == 0);

		return longB;
	}

	private static String inputOperation(Scanner scanner) {
		System.out.println("Пожалуйста, введите операцию:");
		while (!(scanner.hasNext("[+-/*^]{1}") || scanner.hasNext("div")
				|| scanner.hasNext("mod") || scanner.hasNext("exit"))) {
			System.out.println("Неверный выбор операции. Повторите:");
			scanner.next();
		}

		String operation = scanner.next();
		return operation;
	}

	private static void textBanner() {
		System.out.println("Калькулятор нескольких операций для двух чисел.");
		System.out.println("Для расчета введите операцию: +   -    *   ^  /    div   mod");
		System.out.println("Для выхода введите: exit");
	}
}
