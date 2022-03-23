
/* Basic of software code development
 * Циклы, задание 6
 * Вывести на экран соответствиЙ между символами и их численными значениями в памяти компъютера
*/

package by.epam.java.basic.cycle;

public class Cyc6 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i<257; i++) {
			
			System.out.println("Числу " + i + " в кодировке ASCII соответствует символ " + (char)i);
		}
	}
}

