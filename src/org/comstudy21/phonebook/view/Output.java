package org.comstudy21.phonebook.view;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Output extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: OUTPUT :::::::::::::::::::::::");
		ArrayList<PhoneBookDto> list = (ArrayList<PhoneBookDto>)request.get("list"); // �ٿ�ĳ����.
//		System.out.println(list); // ����Ʈ�� �������� Ȯ��
		for(PhoneBookDto dto : list) {
			System.out.println(dto);
		}
	}

}
