
/* Basic of software code development
 * �����, ������� 1
 * ��������� ����� ����� �� ���� �� ��������� �������������
 */

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc1 {

	public static void main(String[] args) {
		
		double a;
		int b = 0; // ������������ �����
		int sum = 0;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ����� ����� ������������� �����");
		a = S.nextDouble(); // �������� �� ������������ �����
		
		
		if (a > 0 && a % 1 == 0) { // ��������� ��� ����� ������������� � �����

			while (a >= b) {
				sum = sum + b;
				b++;
			}
			System.out.println("����� ���� ����� �� 1 �� " + a + " = " + sum);
			
		} else {
			System.out.println("�������� ����� �� ������������� ��������");
		}
	}
}
