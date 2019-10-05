package ru.inordic.study7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci30 {

	public static void main(String[] args) {
		int n = 30; // количество чисел фибоначчи
		сalculateFibonacciArray(n);
	}

	// расчет и вывод чисел фибоначчи с массивом и циклом
	private static void сalculateFibonacciArray(int n) {
		ArrayList<Integer> fibonacciArray = new ArrayList();

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				fibonacciArray.add(i);
				System.out.print(fibonacciArray.get(i) + " ");
			} else {
				fibonacciArray.add(fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2));
				if (i % 10 == 9) {
					System.out.print(fibonacciArray.get(i) + "\n");
				} else {
					System.out.print(fibonacciArray.get(i) + " ");
				}
			}

		}

	}

}
