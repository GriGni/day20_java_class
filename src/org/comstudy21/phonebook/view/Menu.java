package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;
public class Menu extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println(":::::::::::::::::::::::: MENU ::::::::::::::::::::::::");
		System.out.println("1.INPUT  2.OUTPUT  3.SEARCH  4.MODIFY  5.DELETE  6.END");
		System.out.print("Choice>>> ");
		int no = getNum();
		
		//���ҽ��� ���ε��ϰ� ��Ʈ�ѷ��� �̵��Ѵ�.
		//�콬���̺� �ʱ��� ����.
		request.put("no", no); //���� ���� no�� �콬���̺� �ִ´�. 
		
		
	}

}
