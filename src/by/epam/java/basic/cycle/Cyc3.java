
/* Basic of software code development
 * Циклы, задание 3
 * найти сумму квадратов первых ста чисел
*/

package by.epam.java.basic.cycle;

public class Cyc3 {
	
	public static void main(String[] args) {
		
		int x = 0; // число, он же счётчик
		int y = 0; // квадрат числа
		int z = 0; // сумма
		
		while (x <= 100) { // работаем от ноля до ста включительно
			y = x * x;
			z = z + y;
			x++;
		}
		System.out.println("Сумма квадратов первых ста чисел = " + z);
	}
}

