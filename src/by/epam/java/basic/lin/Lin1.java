/* Basic of software code development
 * �������� ���������, ������� 1
 * ��������� �������� �������
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin1 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double z;
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in); // �������� ��������� �������
		System.out.println("������� ����� �");
		a = console.nextDouble();
		System.out.println("������� ����� b");
		b = console.nextDouble();
		System.out.println("������� ����� c");
		c = console.nextDouble();
		
		z = ((a - 3) * b / 2) + c; // �������
		System.out.println("����" + z); // �������
	}
}
