package org.calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
				
		  try (Scanner scanner = new Scanner(System.in)) {
			  
			  // Calculator's text banner 
			  System.out.println("Калькулятор нескольких операций для двух чисел.");
              System.out.println("Для расчета введите операцию: +   -    *   ^  /    div   mod");
              System.out.println("Для выхода введите: exit");
            
              // User input operation         	  
              
              while ( !(scanner.hasNext("\\+") || scanner.hasNext("-") || scanner.hasNext("\\*") || scanner.hasNext("/") 
            		  || scanner.hasNext("div") || scanner.hasNext("mod") || scanner.hasNext("\\^") || scanner.hasNext("exit")  )) {

            	  System.out.println("Неверный выбор операции. Повторите:");
            	  scanner.next();
              }
            
              String operation = scanner.next();

              //calculator cycle
              while( !operation.equals("exit")) {           	    
            	  
            	  System.out.println("Введите 1е число: ");
            	  while (!scanner.hasNextLong()) {
            		  System.out.println("Неверный ввод числа. Повторите:");
            		  scanner.next();
            	  }
            	  Long longA = scanner.nextLong();


            	  System.out.println("Введите 2е число: ");
            	  while ( !scanner.hasNextLong() ) 
            	  {
               		  System.out.println("Неверный ввод числа. Повторите:");
            		  scanner.next();
            	  }
            	  Long longB = scanner.nextLong();
            	  
            	  if (longB == 0 && (operation.equals("div") || operation.equals("/"))) {
            		  System.out.println("На ноль делить нельзя! Введите числа заново.");
            		  continue;
            	  }

            	  switch (operation) {
	            	  case "+":         			
	            		  System.out.println( "сумма: " +  longA + " + " + longB + " = " + (longA + longB) );	
	            		  break;						
	
	            	  case "-":
	            		  System.out.println( "разность: " +  longA + " - " + longB + " = " + (longA - longB) );
	            		  break;
	
	            	  case "*":
	            		  System.out.println("умножение: " +  longA + " * " + longB + " = " + (longA * longB) );
	            		  break;
	
	            	  case "/":
	            		  System.out.println("деление: " +  longA + " / " + longB + " = " + ( (double)longA / longB) );
	            		  break;	
	
	            	  case "div":
	            		  System.out.println("целочисленное деление: " +  longA + " div " + longB + " = " + (longA / longB) );
	            		  break;
	
	            	  case "mod":
	            		  System.out.println("деление по модулю: " +  longA + " mod " + longB + " = " + (longA % longB) );
	            		  break;
	
	            	  case "^":
	            		  // возведение в степень
	            		  Long degreeLongA = 1L; 
	            		  if (longB != 0) {
	            				  for (int i = 0; i < longB; i++) {
		            			  degreeLongA *= longA;
		            		  }
	            		  }
	            		  System.out.println("степень - " + longA + " ^ " + longB + " = " + degreeLongA );
	            		  break;
	
	            	  default:
	            		  //System.out.println("Просто выход по умолчанию из switch" );
	            		  break;
            	  }
            	  
            	  // repeat user operation input
            	  System.out.println("Выберите операцию: " );
            	  while ( !(scanner.hasNext("\\+") || scanner.hasNext("-") || scanner.hasNext("\\*") || scanner.hasNext("/") 
                		  || scanner.hasNext("div") || scanner.hasNext("mod") || scanner.hasNext("\\^") || scanner.hasNext("exit")  )) {

                	  System.out.println("Неверный выбор операции. Повторите:");
                	  scanner.next();
                  } 
            	  operation = scanner.next();
              } 

		  }

		  System.out.println("Всего доброго!");  
	}
}

