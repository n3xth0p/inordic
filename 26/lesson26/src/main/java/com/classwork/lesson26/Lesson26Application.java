package com.classwork.lesson26;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson26Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lesson26Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var scanner = new Scanner(System.in);
		var a = scanner.nextLine();

//		System.out.println(isPalindrom("ABC")); // false
//		System.out.println(isPalindrom("ABCBC")); // false
//		System.out.println(isPalindrom("ABCBA")); // true
//		System.out.println(isPalindrom("TENET")); // true
//		System.out.println(isPalindrom("TEET")); // true
//		System.out.println(isPalindrom("TENEN")); // false
	}
}
