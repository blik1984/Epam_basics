/* Basic of software code development
 * ���������, ������� 5
 * ��������� �������� �������, ��� ��������� ��������� ��������� ������� �������� �� ������ ��������
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran5 {
	
	public static void main(String[] args) {
		
		double x;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ��������� �������� ���������");
		x = S.nextInt();
		
		if (x <= 3) {
			double F;
			F = x * x - 3 * x + 9;
			System.out.println("F(x)= " + F);
			
		} else {
			double F;
			F= 1 / (x * x * x + 6);
			System.out.println("F(x)= " + F);
		}
	}
}
