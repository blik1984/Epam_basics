
/* Basic of software code development
 * Циклы, задание 1
 * Вычислить сумму чисел от ноля до заданного пользователем
 */

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc1 {

	public static void main(String[] args) {
		
		double a;
		int b = 0; // прибавляемая часть
		int sum = 0;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите любое целое положительное число");
		a = S.nextDouble(); // получаем от пользователя число
		
		
		if (a > 0 && a % 1 == 0) { // проверяем что число положительное и целое

			while (a >= b) {
				sum = sum + b;
				b++;
			}
			System.out.println("Сумма всех чисел от 1 до " + a + " = " + sum);
			
		} else {
			System.out.println("Введённое число не соответствует условиям");
		}
	}
}
