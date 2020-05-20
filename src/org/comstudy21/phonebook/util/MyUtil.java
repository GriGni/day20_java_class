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
				if (ch >= '0' && ch <= '9') { // 번호는 스트링으로 들어가서.
					num = num * 10 + ch - '0';
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	// String 출력문

	public static void puts(String s) { // 띄어쓰기 없이 그냥 사용.
		System.out.print(s);
	}

	public static void putsln(String str) { // 띄어쓰기할 때 사용
		System.out.print(str);
	}

}
