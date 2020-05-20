package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Search extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: SEARCH :::::::::::::::::::::::");
		puts("�˻��� �̸� �Է�>>> ");
		String name = scan.next();
		request.put("dto", new PhoneBookDto(0, name, null, null)); // �̸��� �˻��Ұ��̴ϱ� �������� 0, null.
	}

}
