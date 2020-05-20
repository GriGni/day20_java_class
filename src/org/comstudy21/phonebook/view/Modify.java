package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Modify extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: MODIFY :::::::::::::::::::::::");
		//수정전 목록구현
		// 수정할 idx입력 새이름. 새번호, 새이메일. --> dao에 없데이트.
		puts("수정할 idx 입력");
		int idx = scan.nextInt();
		//유효성체크 생략.
		puts("새이름>>>");
		String name = scan.next();
		puts("새 전화번호>>>");
		String phone = scan.next();
		puts("새 이메일>>>");
		String email = scan.next();
		
		request.put("dto", new PhoneBookDto(idx, name, phone, email)); // 수정할 값을 넣는 곳.
	}

}
