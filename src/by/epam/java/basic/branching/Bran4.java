/* Basic of software code development
 * ���������, ������� 4
 * ���������� ������ �� ������ � ��������� XYZ � ��������� ��
 */

package by.epam.java.basic.branching;

import java.util.Scanner;

public class Bran4 {
	
	public static void main(String[] args) {
		
		int A;
		int B;
		int x;
		int y;
		int z;
		String c = "��������";
		String d = "�� ��������";
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������ ���������");
		A = S.nextInt();
		System.out.println("������� ������ ���������");
		B = S.nextInt();
		System.out.println("������� ������ �������");
		x = S.nextInt();
		System.out.println("������� ����� �������");
		y = S.nextInt();
		System.out.println("������� ������ �������");
		z = S.nextInt();
		
		if (A > x && B > y) { 		// ���������� ��� �� ��� ����� ��������� ������� ���� ������ ������� �����.
			System.out.println(c); // ���� ������ ������� ��������� � �������� ����� ������� ��� ������ ��������.
			
		} else if (A >= y && B >= x) { // ����� ��������� ������ ����� ��� ������ �����.
			System.out.println(c);
			
		} else if (A >= x && B >= z) {
			System.out.println(c);
			
		} else if (A >= z && B >= x) {
			System.out.println(c);
			
		} else if (A >= y && B >= z) {
			System.out.println(c);
			
		} else if (A >= z && B >= y) {
			System.out.println(c);
			
		} else {
			System.out.println(d);
		}
	}
}
