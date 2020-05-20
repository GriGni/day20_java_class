package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;
public class Menu extends PhoneBookView {

	@Override
	protected void display() {
		System.out.println(":::::::::::::::::::::::: MENU ::::::::::::::::::::::::");
		System.out.println("1.INPUT  2.OUTPUT  3.SEARCH  4.MODIFY  5.DELETE  6.END");
		System.out.print("Choice>>> ");
		int no = getNum();
		
		//리소스에 바인딩하고 컨트롤러로 이동한다.
		//헤쉬테이블 맵구조 형성.
		request.put("no", no); //전달 받은 no를 헤쉬테이블에 넣는다. 
		
		
	}

}
