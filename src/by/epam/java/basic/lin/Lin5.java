
/* Basic of software code development
 * �������� ���������, ������� 5
 * ��������� ���������� ������ � ����, ������ � �������
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
		System.out.println("������� �������� � �������� "); // �������� �� ������������ ���������� ������
		a = E.nextInt();
		
		hour = a / 3600; // �������� ����
		c = a % 3600; // �������� ������� ������ �� �����
		min = c / 60; // �������� ������
		sec = c % 60; // �������� �������
		
		out = hour + " �����, " + min + " �����, " + sec + " ������."; // ��������� ������ � ������, �������� � ���������
		
		System.out.println(out);
	}
}
