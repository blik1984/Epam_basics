/* Basic of software code development
 * ���������, ������� 2
 * � ���� ����� ����� ����� ����������� ��������, � �� ��������� ���������� ������������
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
		System.out.println("������� ����� �"); // ������������ ��� ��� ����� �����
		a = S.nextInt();
		System.out.println("������� ����� b");
		b = S.nextInt();
		System.out.println("������� ����� c");
		c = S.nextInt();
		System.out.println("������� ����� d");
		d = S.nextInt();
		
		minAB = Math.min(a, b);
		minCD = Math.min(c, d);
		max = Math.max(minAB, minCD);
		
		System.out.println("���� = " + max);
	}
}
