/* Basic of software code development
 * ���������, ������� 1
 * ���������� ����������� ������������� ������������ � ������� ������� ���� � ��� �� ���� �������� �����
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran1 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		int sumXY;
		String a = "����������� �������������";
		String b = "����������� ����������";
		String c = "����������� �� ����� ������������";
		String d = "����������� �� �������� �������������";
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ���� �1"); // ������������ ��� ��� ���� �����
		x = S.nextInt();
		System.out.println("������� ���� �2");
		y = S.nextInt();
		
		sumXY = x + y;
		
		int e = 0;
		if (x == 90) { // ��������� ��������� ���� �� ������������ ������� ����
			e = 1;
			
		} else if (y == 90) {
			e = 1;
			
		} else if (sumXY == 90) { // ���� ����� ��������� ����� 90, �� ������ ���� ���� ����� 90, �.�. ����� ����
								// ����� ������������ 180.
			e = 1;
		} else {
			e = 0;
		}

		if (sumXY > 0 && sumXY < 180 && e == 1) { // ���� ����� ���� ��������� ����� ������ ���� � ������ 180 ��������, �� ��
											// ����� ����.
			System.out.println(b);
			System.out.println(a);
			
		} else if (sumXY > 0 && sumXY < 180 && e == 0) {
			System.out.println(b);
			System.out.println(d);
			
		} else {
			System.out.println(c);
		}
	}
}
