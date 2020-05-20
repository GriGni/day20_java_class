package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Delete extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: DELETE :::::::::::::::::::::::");
		puts("삭제 할 idx 입력>>>");
		int idx = scan.nextInt();
		
		request.put("dto", new PhoneBookDto(idx, null, null, null));
		
	}

}
