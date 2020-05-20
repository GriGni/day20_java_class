package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Modify extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: MODIFY :::::::::::::::::::::::");
		//������ ��ϱ���
		// ������ idx�Է� ���̸�. ����ȣ, ���̸���. --> dao�� ������Ʈ.
		puts("������ idx �Է�");
		int idx = scan.nextInt();
		//��ȿ��üũ ����.
		puts("���̸�>>>");
		String name = scan.next();
		puts("�� ��ȭ��ȣ>>>");
		String phone = scan.next();
		puts("�� �̸���>>>");
		String email = scan.next();
		
		request.put("dto", new PhoneBookDto(idx, name, phone, email)); // ������ ���� �ִ� ��.
	}

}
