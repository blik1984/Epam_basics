
/* Basic of software code development
 * �����, ������� 2
 * ��������� �������� ������� �� ������� � �������� �����. � ����������� �� ��������� ������� ��������� �� ���� ��������
*/

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc2 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double step;
		double y;
		int d = 1;
		double minBorder;
		double maxBorder;

		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������ ���������"); // �������� ������� ��������� � ��� ����������
		a = S.nextDouble();
		System.out.println("������� ����� ���������");
		b = S.nextDouble();
		System.out.println("������� ��� ����������");
		step = S.nextDouble();
		
		minBorder = Math.min(a, b); // ���������� ������ ������� ���������, ������ �� ����� �� �� �������
		maxBorder = Math.max(a, b); // ���������� ������� ������� ���������
		
		while (minBorder <= maxBorder) {
			
			if (minBorder > 2) {
				y = minBorder;
				System.out.println("Y" + d + " = " + y);
				minBorder = minBorder + step;
				d++;
				
			} else {
				y = 0 - minBorder;
				System.out.println("Y" + d + " = " + y);
				minBorder = minBorder + step;
				d++;
			}
		}
	}
}
