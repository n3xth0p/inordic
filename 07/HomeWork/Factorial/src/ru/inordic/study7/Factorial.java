package ru.inordic.study7;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int num = inputNumber();
		long fact = calculateFactorial(num);
		resultOutput(num, fact);
	}

	private static int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Рачет факториала числа - n!");
		System.out.println("Пожалуйста введите n:");

		int num;

		do {
			while (!scanner.hasNextInt()) {
				System.out.println("Неверный ввод. Это не число. Повторите пожалуйста:");
				scanner.next();
			}

			num = scanner.nextInt();
			if (num < 0) {
				System.out.println("Неверный ввод. введите неотрицательное число");
			}

		} while (num < 0);

		scanner.close();

		return num;
	}

	private static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			long fact = n * calculateFactorial(n - 1);
			return fact;
		}

	}

	private static void resultOutput(int num, long result) {
		System.out.println("Факториал " + num + "! = " + result);
	}
}
