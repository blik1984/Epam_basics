/* Basic of software code development
 * Циклы, задание 7
 * Для каждого натурального числа в заданном пользователем диапазоне вывести все делители кроме единицы и самого числа 
*/

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc7 {
	
	public static void main(String[] args) {
		
		int m;
		int n;
		int minBord;
		int maxBord;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите начало диапазона в виде целого положительного числа");
		m = S.nextInt();
		System.out.println("Введите конец диапазона в виде целого положительного числа");
		n = S.nextInt();
		
		minBord = Math.min(m, n);
		maxBord = Math.max(m, n);
		
		while (minBord <= maxBord) {
			
			for (int i = 2; i < minBord; i++) { // делитель начинается с 2 (исключаем единицу) и увеличивается не достигая
											// самого числа (исключаем само число)
				if ((minBord % i) == 0) { // принимаем что делитель должен быть целым (условием не задано).
					System.out.println("Число " + minBord + " делится на " + i);
				}
			}
			minBord++;
		}
	}
}
