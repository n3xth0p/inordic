package ru.inordic.study24.SimpleDigit;

public class PrimeNumber {

  public static boolean isPrime(Integer number) {
    if (number == null) {
      return false;
    } else if (number <= 1) {
      return false;
    } else if (number == 2 || number == 3) {
      return true;
    } else {
      for (int i = 2; i * i <= number; i += 2) {
        if (number % i == 0) {
          return false;
        }
      }
    }

    return true;
  }

}
