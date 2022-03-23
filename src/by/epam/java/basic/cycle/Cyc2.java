

/* Basic of software code development
 * Циклы, задание 2
 * Вычислить значение функции на отрезке с заданным шагом. В зависимости от аргумента функция считается по двум формулам
*/

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc2 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double step;
		double y;
		int d = 1;
		double minBorder;
		double maxBorder;

		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Укажите начало диапазона"); // получаем границы диапазона и шаг вычислений
		a = S.nextDouble();
		System.out.println("Укажите конец диапазона");
		b = S.nextDouble();
		System.out.println("Укажите шаг вычислений");
		step = S.nextDouble();
		
		minBorder = Math.min(a, b); // определяем нижнюю границу диапазона, ввести их могут не по порядку
		maxBorder = Math.max(a, b); // определяем верхнюю границу диапазона
		
		while (minBorder <= maxBorder) {
			
			if (minBorder > 2) {
				y = minBorder;
				System.out.println("Y" + d + " = " + y);
				minBorder = minBorder + step;
				d++;
				
			} else {
				y = 0 - minBorder;
				System.out.println("Y" + d + " = " + y);
				minBorder = minBorder + step;
				d++;
			}
		}
	}
}
