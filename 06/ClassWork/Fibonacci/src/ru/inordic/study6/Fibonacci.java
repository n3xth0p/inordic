package ru.inordic.study6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int topNumber = inputNumber();

		int resultR = сalculateFibonacciR(topNumber);
		int resultC = сalculateFibonacciC(topNumber);

		resultOutput(topNumber, resultR, resultC);

	}

	// вывод результата
	private static void resultOutput(int topNumber, int resultR, int resultC) {
		System.out.println("Рекурсия: Число фибоначчи под номером " + topNumber + " равно " + resultR);
		System.out.println("Цикл: Число фибоначчи под номером " + topNumber + " равно " + resultC);
	}

	// ввод номера
	private static int inputNumber() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Пожалуйста введите номер числа фибоначчи:");

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

	// расчет числа фибоначчи рекурсией
	private static int сalculateFibonacciR(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int fib = сalculateFibonacciR(n - 1) + сalculateFibonacciR(n - 2);
			return fib;
		}

	}

	// расчет числа фибоначчи циклом
	private static int сalculateFibonacciC(int n) {
		int a = 1;
		int b = 0;

		for (int i = 0; i < n; i++) {
			a = a + b;
			b = a - b;
		}

		return b;
	}

}
