/* Basic of software code development
 * �������� ���������, ������� 2
 * ��������� �������� ��������� �� �������
 */

package by.epam.java.basic.lin;

import java.util.Scanner;

public class Lin2 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double z;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.print("������� ����� �"); // �������� �� ������������ ����������
		a = S.nextDouble();
		System.out.print("������� ����� b");
		b = S.nextDouble();
		System.out.print("������� ����� c");
		c = S.nextDouble();
		
		z = ((b + Math.pow(b * b + 4 * a * c, 1 / 2)) / 2 * a) - a * a * a * c + Math.pow(b, -2); 
																									
		System.out.print("����= " + z);
	}
}
