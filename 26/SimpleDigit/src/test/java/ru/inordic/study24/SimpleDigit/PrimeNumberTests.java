package ru.inordic.study24.SimpleDigit;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
public class PrimeNumberTests {

  @Test
  @DisplayName("Проверка на простоту - null")
  public void isFalsePrimeNumberTestNull() {
    boolean result = PrimeNumber.isPrime(null);
    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на простоту - 1")
  public void isTruePrimeNumberTest1() {
    boolean result = PrimeNumber.isPrime(1);
    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на простоту - 2")
  public void isTruePrimeNumberTest2() {
    boolean result = PrimeNumber.isPrime(2);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка на простоту - 3")
  public void isTruePrimeNumberTest3() {
    boolean result = PrimeNumber.isPrime(3);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка на простоту - 1001821 ")
  public void isTruePrimeNumberTest1001821() {
    boolean result = PrimeNumber.isPrime(1001821);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка на простоту - 20004997")
  public void isTruePrimeNumberTest20004997() {
    boolean result = PrimeNumber.isPrime(20004997);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка на простоту - 0")
  public void isFalsePrimeNumberTest0() {
    boolean result = PrimeNumber.isPrime(0);
    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка на простоту - отрицательное -10")
  public void isFalsePrimeNumberTestNegative() {
    boolean result = PrimeNumber.isPrime(-10);
    assertThat(result).isFalse();
  }
}
