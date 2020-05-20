package org.comstudy21.phonebook.view;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Output extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: OUTPUT :::::::::::::::::::::::");
		ArrayList<PhoneBookDto> list = (ArrayList<PhoneBookDto>)request.get("list"); // 다운캐스팅.
//		System.out.println(list); // 리스트가 뽑히는지 확인
		for(PhoneBookDto dto : list) {
			System.out.println(dto);
		}
	}

}
