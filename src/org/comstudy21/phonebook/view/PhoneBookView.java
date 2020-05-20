package org.comstudy21.phonebook.view;

import java.util.Scanner;

import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.util.MyUtil;  // �θ�Ŭ�������� ��ƿ�� �ִ� ����� �������� ������ �� ��밡��.

public abstract class PhoneBookView implements R { // ���� ���� �ֻ��� �θ� Ŭ����
	
	protected static Scanner scan = MyUtil.scan; // ��Ӱ��� �������� ��ĳ�ʸ� ����� ��� �θ� ��ƿ�� �����ϸ� �ٸ� ���� Ŭ������ ��ĳ�ʸ� ������ �ʿ���� �ٷ� ��� ����.
	protected abstract void display();// �ܺο��� ���� ���� ������Ƽ��� ����. ��ӹ޴� ���踸 ��������.  �߻�޼ҵ带 �ϴ� ���� �߻�޼ҵ带 ����Ͽ� ���� Ŭ������ �ڽſ� �°� ����.
	
	//2. ���ø� �޼��� 
	public void show() { // ���÷��� ��Ʈ 
		System.out.println("------------------------------------------------------------");
		display();
	}
	
}
