
/* Basic of software code development
 * Циклы, задание 2
 * Произведение квадратов первых двухсот чисел
*/

package by.epam.java.basic.cycle;

import java.math.*;

@SuppressWarnings("unused")
public class Cyc4 {
	public static void main(String[] args) {
		
		/*
		int a = 1; // счётчик
		BigInteger x = BigInteger.valueOf(1); // число
		BigInteger b = BigInteger.valueOf(1); // для увеличения числа
		BigInteger y = BigInteger.valueOf(1); // квадрат числа
		BigInteger z = BigInteger.valueOf(1); // произведение квадратов
		while (a <= 200) {
			y = x.multiply(x);
			z = z.multiply(y);
			x = x.add(b);
			a++;
		}
		System.out.println("Произведение квадратов первых двухста чисел = " + z);
		*/
		
		int Val = 1;
		long squareVal;
		long multSquareVal = 1;
		long MAX = Long.MAX_VALUE;
		
		//System.out.println(MAX);
		
		while (Val<=200) {
			squareVal = Val*Val;
			
			if ((multSquareVal)>=Long.MAX_VALUE/squareVal) {
				System.out.println("По достижении числа " + Val+ " произведение выходит за допустимые границы типа LONG");
				Val=201;
				
			} else {
			multSquareVal = squareVal*multSquareVal;  
			Val++;
			System.out.println(multSquareVal);
			}
		}
		if (Val==200) {
			System.out.println("Произведение квадратов первых двухста чисел = " + multSquareVal);
		}
	}
}
