
/* Basic of software code development
 * �������� ���������, ������� 3
 * ��������� �������� ��������� �� �������
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin3 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		double c;
		
		@SuppressWarnings("resource")
		Scanner Z = new Scanner(System.in); // �������� ����������
		System.out.println("������� �������� �");
		x = Z.nextDouble();
		System.out.println("������� �������� �");
		y = Z.nextDouble();
		
		c = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y)); // ������� ���������
		System.out.println(c);
	}
}
