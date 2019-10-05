package ru.inordic.study5;

import java.util.Scanner;

public class AmountEvenNumbers {

	public static void main(String[] args) {

		int topNumber = inputNumber();

		int result = CalculateAmount(topNumber);

		resultOutput(topNumber, result);

	}

	// вывод результата
	private static void resultOutput(int topNumber, int result) {
		System.out.println("Сумма четных чисел от 0 до " + topNumber + " равна " + result);
	}

	// ввод порога N
	private static int inputNumber() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Пожалуйста введите число:");

		while (!scanner.hasNextInt()) {
			System.out.println("Неверный ввод числа. Повторите пожалуйста:");
			scanner.next();
		}

		int topNumber = scanner.nextInt();
		scanner.close();

		return topNumber;
	}

	// расчет суммы
	private static int CalculateAmount(int n) {
		int amount = 0;

		for (int i = 0; i <= n; i = i + 2) {
			amount += i;
		}

		return amount;
	}

}
