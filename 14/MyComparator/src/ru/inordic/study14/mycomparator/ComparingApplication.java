package ru.inordic.study14.mycomparator;

import java.util.ArrayList;
import java.util.Scanner;

import ru.inordic.study14.mycomparator.*;

public class ComparingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var scanner = new Scanner(System.in);
		var numbers = new ArrayList<String>();
		
		System.out.println("Введите числа: ");
		
		var inputString = scanner.nextLine();
		
		while (!"".equals(inputString)) {
			numbers.add(inputString);
			inputString = scanner.nextLine();
		}
		
		System.out.print("Перед сортировкой - ");
		System.out.println(numbers);
		
		numbers.sort(new DigitValueComparator());
		
		System.out.print("После сортировки - ");
		System.out.println(numbers);
	
	}

}
