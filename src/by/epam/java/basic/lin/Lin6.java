
/* Basic of software code development
 * �������� ���������, ������� 6
 * ��������� �������� �� ����� � ��������� ������������ � ��������� �������
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin6 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		@SuppressWarnings("resource")
		Scanner A = new Scanner(System.in);
		System.out.println("������� ���������� �"); // �������� ���������� ��� ��������.
		x = A.nextInt(); // ������������ ��� ��� ����� �����
		System.out.println("������� ���������� �");
		y = A.nextInt();
		
		if (x >= -2 && x <= 2 && y >= 0 && y <= 3) { // ��������� �������� �� ����� � �������� �������
														// �������� ������� �� 2 ����� ��� �� ������ �� ����������
			System.out.println("true");
			
		} else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
	}
}
