package org.comstudy21.phonebook.util;

import java.io.IOException;
import java.util.Scanner;

public class MyUtil {
	public static final Scanner scan = new Scanner(System.in);

	public static int getNum() {
//		int num = 0;
//		int ch = 0;
//		while((ch = System.in.read())!='\n') {
//			
//		}
		int num = 0;
		try {
			int ch = 0;
			while ((ch = System.in.read()) != '\n')
				if (ch >= '0' && ch <= '9') { // ��ȣ�� ��Ʈ������ ����.
					num = num * 10 + ch - '0';
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	// String ��¹�

	public static void puts(String s) { // ���� ���� �׳� ���.
		System.out.print(s);
	}

	public static void putsln(String str) { // ������ �� ���
		System.out.print(str);
	}

}
