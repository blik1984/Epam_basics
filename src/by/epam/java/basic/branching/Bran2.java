/* Basic of software code development
 * Ветвления, задание 2
 * В двух парах чисел найти минимальные значения, а из найденных определить максимальное
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran2 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int minAB;
		int minCD;
		int max;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите число а"); // Предполагаем что все числа целые
		a = S.nextInt();
		System.out.println("Введите число b");
		b = S.nextInt();
		System.out.println("Введите число c");
		c = S.nextInt();
		System.out.println("Введите число d");
		d = S.nextInt();
		
		minAB = Math.min(a, b);
		minCD = Math.min(c, d);
		max = Math.max(minAB, minCD);
		
		System.out.println("Итог = " + max);
	}
}
