/* LOGOS academy*/

package ua.lviv.lgs.auto;

/***
 * @since java 1.8
 * @author mimo3a
 * @version 1.1
 * 
 * 
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ApplicationAuto {
	public static void main(String[] args) {
		/*Name of class*/

//	��������� ��������� �����	

		int firstLength = new Random().nextInt(50) + 1;
		int secondLength = new Random().nextInt(20) + 1;
		Auto[][] autoArray = new Auto[firstLength][secondLength];

//		���������� ���� ����������

		for (int i = 0; i < firstLength; i++) {
			for (int j = 0; j < secondLength; j++) {
				Auto auto = new Auto();
				autoArray[i][j] = auto;
			}
		}

//		��������� ����

		System.out.println("�������� 1 ��� ������� �������� ������ ������");
		System.out.println("�������� 2 ��� ��������� ����� ���������� ����������");
		while (true) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			if (number == 1) {
				System.out.println(Arrays.deepToString(autoArray));
			}
			if (number == 2) {
				Auto a1 = new Auto();
				for (Auto[] ar : autoArray) {
					Arrays.fill(ar, a1);
				}

				System.out.println(Arrays.deepToString(autoArray));
			}
		}

	}

}
