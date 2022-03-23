/* Basic of software code development
 * Линейные программы, задание 1
 * Вычислить значение функции
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin1 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double z;
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in); // получаем аргументы функции
		System.out.println("Введите число а");
		a = console.nextDouble();
		System.out.println("Введите число b");
		b = console.nextDouble();
		System.out.println("Введите число c");
		c = console.nextDouble();
		
		z = ((a - 3) * b / 2) + c; // считаем
		System.out.println("Итог" + z); // выводим
	}
}
