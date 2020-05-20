package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*; // 스테틱 중요 유틸것을 가져오는것

import org.comstudy21.phonebook.model.PhoneBookDto;

public class Input extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println("::::::::::::::::::::::: INPUT ::::::::::::::::::::::::"); // 타이틀도 한곳에서 처리하게 만들 수 있다.
		//입력된 값이 저장되어야하므로 dto에서 구현 겟터스 셋터스 그리고 input 오버로딩에서 구현
		//MyUtil클래스에 puts()와 putsln() 함수를 선언해서 활용
		puts("성명 입력>>>");
		String name = scan.next();
		puts("전화번호 입력>>>");
		String phone = scan.next();
		puts("이메일 입력>>>");
		String email = scan.next();
		
		//입력받은 정보를 dto 객체에 담아서 request에 담아서 바인딩한다. (바인딩 - 묶는다.)
		PhoneBookDto dto = new PhoneBookDto(0, name, phone, email);
		request.put("dto", dto);
		//입력 완료 후 컨트롤러로 이동한다.
	}

}
