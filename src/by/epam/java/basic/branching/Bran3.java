/* Basic of software code development
 * ���������, ������� 3
 * ���������� ����� �� ��� ����� � ��������� ������������ �� ����� ������
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran3 {
	
	public static void main(String[] args) {
		
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		String c = "����� ����� �� ����� ������";
		String d = "����� �� ����� �� ����� ������";
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ���������� � ��� ����� 1"); // ������������ ��� ��� ����� �����, ����� �����
																// ������������ double ������ int
		x1 = S.nextInt();
		System.out.println("������� ���������� Y ��� ����� 1");
		y1 = S.nextInt();
		System.out.println("������� ���������� � ��� ����� 2");
		x2 = S.nextInt();
		System.out.println("������� ���������� Y ��� ����� 2");
		y2 = S.nextInt();
		System.out.println("������� ���������� � ��� ����� 3");
		x3 = S.nextInt();
		System.out.println("������� ���������� Y ��� ����� 3");
		y3 = S.nextInt();
		
		if (x1 == x2 && x2 == x3) { // ���� � ����� ���� �� ��������� ����������, ����� ����� �� ����� ������, ��
									// ������� �������� �� ��������,
			System.out.println(c); // �� ���� ������ ������, ������ ������� ��������� ���������� �� ����������.
									// ��������� �.
		} else if (y1 == y2 && y2 == y3) { // ��������� ���������� � �� ����������
			System.out.println(c);
			
		} else if (((y3 - y1) / (y2 - y1)) == ((x3 - x1) / (x2 - x1))) { // ��������� �� �������
			System.out.println(c);
			
		} else {
			System.out.println(d);
		}
	}
}
