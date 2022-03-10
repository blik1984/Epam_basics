/* Basic of software code development
 * Ветвления, задание 4
 * Определить пройдёт ли кирпич с размерами XYZ в отверстие АВ
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran4 {
	
	public static void main(String[] args) {
		
		int A;
		int B;
		int x;
		int y;
		int z;
		String c = "Пролезет";
		String d = "Не пролезет";
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Введите ширину отверстия");
		A = S.nextInt();
		System.out.println("Введите высоту отверстия");
		B = S.nextInt();
		System.out.println("Введите ширину кирпича");
		x = S.nextInt();
		System.out.println("Введите длину кирпича");
		y = S.nextInt();
		System.out.println("Введите высоту кирпича");
		z = S.nextInt();
		
		if (A > x && B > y) { 		// Достаточно что бы два любых измерения кирпича были меньше размера проёма.
			System.out.println(c); // Если размер кирпича совпадает с размером проёма считаем что кирпич пролазит.
			
		} else if (A >= y && B >= x) { // нужно поставить Больше равно или Меньше равно.
			System.out.println(c);
			
		} else if (A >= x && B >= z) {
			System.out.println(c);
			
		} else if (A >= z && B >= x) {
			System.out.println(c);
			
		} else if (A >= y && B >= z) {
			System.out.println(c);
			
		} else if (A >= z && B >= y) {
			System.out.println(c);
			
		} else {
			System.out.println(d);
		}
	}
}
