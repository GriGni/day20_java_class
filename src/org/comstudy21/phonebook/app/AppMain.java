package org.comstudy21.phonebook.app;

//import static org.comstudy21.phonebook.resource.R.*;

import org.comstudy21.phonebook.controller.PhoneBookController;
//import org.comstudy21.phonebook.view.Menu; // 메뉴 임폴트 메뉴 것을 가져올때.

public class AppMain {
	//응집력은 높이고 결합도는 낮춘다.
	public static void main(String[] args) {
		PhoneBookController controller = new PhoneBookController();  // 바로 메인에서 만들수도 있지만 mvc 패턴은 controller를 거쳐야한다. 어떻게 구현할지 그리고 연결되면 메인에서 컨트롤러로 연결
		controller.service();
	}
}
