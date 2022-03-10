
/* Basic of software code development
 * Циклы, задание 5
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Дана формула определения члена ряда
*/

package by.epam.java.basic.cycle;

import java.util.*;

public class Cyc5 {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		double borderMin;
		double borderMax;
		double summ=0;
		@SuppressWarnings("unused")
		String trash;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		
		System.out.println("Введите границу №1 ряда, величина должна быть равна или больше нуля");
		
		while (!S.hasNextDouble()) {
			System.out.println("Введите границу №1 ряда, величина должна быть равна или больше нуля");
			trash = S.nextLine();
		}
		n1 = S.nextDouble();
		
		while (n1<0) {
			System.out.println("Введите границу №1 ряда, величина должна быть равна или больше нуля");
			n1 = S.nextDouble();
		}
		
		System.out.println("Введите границу №2 ряда, величина должна быть равна или больше нуля");
		
		while (!S.hasNextDouble()) {
			System.out.println("Введите границу №2 ряда, величина должна равна или больше нуля");
			trash = S.nextLine();
		}
		n2 = S.nextDouble();
		while (n2<0) {
			System.out.println("Введите границу №2 ряда, величина должна быть равна или больше нуля");
			n2 = S.nextDouble();
		}
		System.out.println("Введите эталон сравнения, величина должна быть больше нуля");
		// если эталон ноль или меньше, то суммировать надо все элементы ряда, т.к. используем их модуль
		
		while (!S.hasNextDouble()) {
			System.out.println("Введите эталон сравнения, величина должна быть больше нуля");
			trash = S.nextLine();
		}
		
		double e = S.nextDouble();
		while (e<=0) {
			System.out.println("Введите эталон сравнения, величина должна быть равна или больше нуля");
			e = S.nextDouble();
		}
		
		borderMin = Math.min(n1, n2);
		borderMax = Math.max(n1, n2);
		
		while (borderMin <= borderMax) {
			
			double a;
			
			a = Math.abs((1 / Math.pow(2, borderMin)) + (1 / Math.pow(3, borderMin))); // считаем элемент и берём модуль
			
			if (a >= e) // если модуль элемента больше или равен эталону, то суммируем
			{
				summ = summ + a;
			}
			borderMin++; // Принимаем шаг равным единице т.к. не задано в описании.
		}
		System.out.println("Сумма = " + summ);
	}
}