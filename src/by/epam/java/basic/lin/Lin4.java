
/* Basic of software code development
 * �������� ���������, ������� 4
 * �������� ������� ����� � ������� ����� ��������� �����
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin4 {
	
	public static void main(String[] args) {
		
		double x;
		int a;
		double b;
		int c;
		String d;
		
		@SuppressWarnings("resource")
		Scanner A = new Scanner(System.in);
		System.out.println("������� ����� � ���� nnn,DDD, ����������� �������"); // �������� �� ������������ �����
		x = A.nextDouble();
		
		a = (int) x; // �������� ����� �� �������
		b = 1000 * (x % 1); // �������� ����� ����� ������� � ��������� ������� �� 3 ������� �.�. � �������
									// ����� ������� ��� �����
		c = (int) Math.round(b); // ��������� �� �����
		d = c + "," + a; // ������������
		
		System.out.println(d);
	}
}