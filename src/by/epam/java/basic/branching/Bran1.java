/* Basic of software code development
 * Ветвления, задание 1
 * Определить возможность существования треугольника и наличие прямого угла в нем по двум заданным углам
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran1 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		int sumXY;
		String a = "Треугольник прямоугольный";
		String b = "Треугольник существует";
		String c = "Треугольник не может существовать";
		String d = "Треугольник не является прямоугольным";
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите угол №1"); // Предполагаем что все углы целые
		x = S.nextInt();
		System.out.println("Введите угол №2");
		y = S.nextInt();
		
		sumXY = x + y;
		
		int e = 0;
		if (x == 90) { // проверяем известные углы на соответствие прямому углу
			e = 1;
			
		} else if (y == 90) {
			e = 1;
			
		} else if (sumXY == 90) { // если сумма известных углов 90, то третий угол тоже будет 90, т.к. сумма всех
								// углов треугольника 180.
			e = 1;
		} else {
			e = 0;
		}

		if (sumXY > 0 && sumXY < 180 && e == 1) { // если сумма двух известных углов больше ноля и меньше 180 градусов, то он
											// может быть.
			System.out.println(b);
			System.out.println(a);
			
		} else if (sumXY > 0 && sumXY < 180 && e == 0) {
			System.out.println(b);
			System.out.println(d);
			
		} else {
			System.out.println(c);
		}
	}
}
