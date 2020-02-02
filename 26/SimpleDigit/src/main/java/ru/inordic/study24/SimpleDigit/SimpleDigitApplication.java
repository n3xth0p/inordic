package ru.inordic.study24.SimpleDigit;

import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleDigitApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SimpleDigitApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub

    System.out.println("введите число:");
    var scanner = new Scanner(System.in);
    Integer num = scanner.nextInt();

    System.out.println(PrimeNumber.isPrime(num));

  }

}
