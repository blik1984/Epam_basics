
/* Basic of software code development
 * Линейные программы, задание 4
 * Поменять местами целую и дробную часть заданного числа
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin4 {
	
	public static void main(String[] args) {
		
		double x;
		int a;
		double b;
		int c;
		String d;
		
		@SuppressWarnings("resource")
		Scanner A = new Scanner(System.in);
		System.out.println("Введите число в виде nnn,DDD, разделитель запятая"); // получаем от пользователя число
		x = A.nextDouble();
		
		a = (int) x; // выделяем цифры до запятой
		b = 1000 * (x % 1); // выделяем цифры после запятой и переносим запятую на 3 позиции т.к. в задании
									// после запятой три знака
		c = (int) Math.round(b); // округляем до целых
		d = c + "," + a; // переставляем
		
		System.out.println(d);
	}
}