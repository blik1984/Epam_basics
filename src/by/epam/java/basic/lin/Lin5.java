
/* Basic of software code development
 * Линейные программы, задание 5
 * Перевести количество секунд в часы, минуты и секунды
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin5 {
	
	public static void main(String[] args) {
		
		int a;
		int hour;
		int c;
		int min;
		int sec;
		String out;
		
		@SuppressWarnings("resource")
		Scanner E = new Scanner(System.in);
		System.out.println("Введите значение в секундах "); // получаем от пользователя количество секунд
		a = E.nextInt();
		
		hour = a / 3600; // получаем часы
		c = a % 3600; // получаем остаток секунд от часов
		min = c / 60; // получаем минуты
		sec = c % 60; // получаем секунды
		
		out = hour + " часов, " + min + " минут, " + sec + " секунд."; // формируем строку с часами, минутами и секундами
		
		System.out.println(out);
	}
}
