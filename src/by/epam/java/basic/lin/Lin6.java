
/* Basic of software code development
 * Линейные программы, задание 6
 * Проверить попадает ли точка с заданными координатами в некоторую область
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin6 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		@SuppressWarnings("resource")
		Scanner A = new Scanner(System.in);
		System.out.println("Введите координату Х"); // Получаем координаты для проверки.
		x = A.nextInt(); // Предполагаем что все числа целые
		System.out.println("Введите координату У");
		y = A.nextInt();
		
		if (x >= -2 && x <= 2 && y >= 0 && y <= 3) { // проверяем попадает ли точка в заданную область
														// проверка разбита на 2 части что бы самому не запутаться
			System.out.println("true");
			
		} else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
	}
}
