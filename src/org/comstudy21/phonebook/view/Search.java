package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Search extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: SEARCH :::::::::::::::::::::::");
		puts("검색할 이름 입력>>> ");
		String name = scan.next();
		request.put("dto", new PhoneBookDto(0, name, null, null)); // 이름을 검색할것이니까 나머지는 0, null.
	}

}
