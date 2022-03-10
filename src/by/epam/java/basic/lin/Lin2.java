/* Basic of software code development
 * Линейные программы, задание 2
 * Вычислить значение выражения по формуле
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin2 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double z;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.print("Введите число а"); // получаем от пользователя переменные
		a = S.nextDouble();
		System.out.print("Введите число b");
		b = S.nextDouble();
		System.out.print("Введите число c");
		c = S.nextDouble();
		
		z = ((b + Math.pow(b * b + 4 * a * c, 1 / 2)) / 2 * a) - a * a * a * c + Math.pow(b, -2); 
																									
		System.out.print("Итог= " + z);
	}
}
