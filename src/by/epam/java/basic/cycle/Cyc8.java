
/* Basic of software code development
 * �����, ������� 8
 * ���� ��� �����, ���������� �����, ������� ����������� � ����� ������
*/

package by.epam.java.basic.cycle;

import java.util.Scanner;

public class Cyc8 {
	
	public static void main(String[] args) {
		
		String num1;
		String num2;
		int count = 0;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������ �����");
		num1 = S.next();
		System.out.println("������� ������ �����");
		num2 = S.next();
		
		while (count <= 9) {
			
			String a0 = "" + count;
			boolean b1 = (num1.contains(a0));
			boolean b2 = (num2.contains(a0));
			
			if (b1 == true && b2 == true) {
				System.out.println("����� " + a0 + " ����������� � ����� ������");
			}
			count++;
		}
	}
}
