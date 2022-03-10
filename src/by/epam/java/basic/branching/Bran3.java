/* Basic of software code development
 * Ветвления, задание 3
 * Определить лежат ли три точки с заданными координатами на одной прямой
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran3 {
	
	public static void main(String[] args) {
		
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		String c = "Точки лежат на одной прямой";
		String d = "Точки не лежат на одной прямой";
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите координату Х для точки 1"); // Предполагаем что все числа целые, иначе нужно
																// использовать double вместо int
		x1 = S.nextInt();
		System.out.println("Введите координату Y для точки 1");
		y1 = S.nextInt();
		System.out.println("Введите координату Х для точки 2");
		x2 = S.nextInt();
		System.out.println("Введите координату Y для точки 2");
		y2 = S.nextInt();
		System.out.println("Введите координату Х для точки 3");
		x3 = S.nextInt();
		System.out.println("Введите координату Y для точки 3");
		y3 = S.nextInt();
		
		if (x1 == x2 && x2 == x3) { // Если у точек одна из координат одинаковая, точки лежат на одной прямой, но
									// формула проверки не работает,
			System.out.println(c); // на ноль делить нельзя, потому сначала проверяем координаты на совпадение.
									// Проверяем Х.
		} else if (y1 == y2 && y2 == y3) { // проверяем координату У на совпадение
			System.out.println(c);
			
		} else if (((y3 - y1) / (y2 - y1)) == ((x3 - x1) / (x2 - x1))) { // проверяем по формуле
			System.out.println(c);
			
		} else {
			System.out.println(d);
		}
	}
}
