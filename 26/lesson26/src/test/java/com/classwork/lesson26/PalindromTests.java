package com.classwork.lesson26;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PalindromTests {

	@Test
	@DisplayName("Проверка непалиндрома нечетной длины строки на палиндром")
	public void IsTrueOddPalindromTest() {
		var result = new Palindrome().isPalindrom("TENET");

		assertThat(result).isTrue();
	}

	@Test
	public void IsTrueEvenPalindromTest() {
		var result = new Palindrome().isPalindrom("TEET");
		
		assertThat(result).isTrue();
	}
	
	@Test
	public void IsFalseOddPalindromTest() {
		var result = new Palindrome().isPalindrom("TENAT");
		
		assertThat(result).isFalse();
	}

	@Test
	public void IsFalseEvenPalindromTest() {
		var result = new Palindrome().isPalindrom("TEAT");
		
		assertThat(result).isFalse();
	}
}
