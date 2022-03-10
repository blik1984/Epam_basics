
/* Basic of software code development
 * Линейные программы, задание 3
 * Вычислить значение выражения по формуле
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin3 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		double c;
		
		@SuppressWarnings("resource")
		Scanner Z = new Scanner(System.in); // получаем переменные
		System.out.println("Введите значение х");
		x = Z.nextDouble();
		System.out.println("Введите значение у");
		y = Z.nextDouble();
		
		c = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y)); // считаем выражение
		System.out.println(c);
	}
}
