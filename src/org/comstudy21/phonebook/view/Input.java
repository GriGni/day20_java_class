package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*; // ����ƽ �߿� ��ƿ���� �������°�

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Input extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: INPUT ::::::::::::::::::::::::"); // Ÿ��Ʋ�� �Ѱ����� ó���ϰ� ���� �� �ִ�.
		//�Էµ� ���� ����Ǿ���ϹǷ� dto���� ���� ���ͽ� ���ͽ� �׸��� input �����ε����� ����
		//MyUtilŬ������ puts()�� putsln() �Լ��� �����ؼ� Ȱ��
		puts("���� �Է�>>>");
		String name = scan.next();
		puts("��ȭ��ȣ �Է�>>>");
		String phone = scan.next();
		puts("�̸��� �Է�>>>");
		String email = scan.next();
		
		//�Է¹��� ������ dto ��ü�� ��Ƽ� request�� ��Ƽ� ���ε��Ѵ�. (���ε� - ���´�.)
		PhoneBookDto dto = new PhoneBookDto(0, name, phone, email);
		request.put("dto", dto);
		//�Է� �Ϸ� �� ��Ʈ�ѷ��� �̵��Ѵ�.
	}

}
