
/* Basic of software code development
 * �����, ������� 2
 * ������������ ��������� ������ ������� �����
*/

package by.epam.java.basic.cycle;

import java.math.*;

@SuppressWarnings("unused")
public class Cyc4 {
	public static void main(String[] args) {
		
		/*
		int a = 1; // �������
		BigInteger x = BigInteger.valueOf(1); // �����
		BigInteger b = BigInteger.valueOf(1); // ��� ���������� �����
		BigInteger y = BigInteger.valueOf(1); // ������� �����
		BigInteger z = BigInteger.valueOf(1); // ������������ ���������
		while (a <= 200) {
			y = x.multiply(x);
			z = z.multiply(y);
			x = x.add(b);
			a++;
		}
		System.out.println("������������ ��������� ������ ������� ����� = " + z);
		*/
		
		int Val = 1;
		long squareVal;
		long multSquareVal = 1;
		long MAX = Long.MAX_VALUE;
		
		//System.out.println(MAX);
		
		while (Val<=200) {
			squareVal = Val*Val;
			
			if ((multSquareVal)>=Long.MAX_VALUE/squareVal) {
				System.out.println("�� ���������� ����� " + Val+ " ������������ ������� �� ���������� ������� ���� LONG");
				Val=201;
				
			} else {
			multSquareVal = squareVal*multSquareVal;  
			Val++;
			System.out.println(multSquareVal);
			}
		}
		if (Val==200) {
			System.out.println("������������ ��������� ������ ������� ����� = " + multSquareVal);
		}
	}
}
