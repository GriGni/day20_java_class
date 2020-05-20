package org.comstudy21.phonebook.resource;

import java.util.ArrayList;
import java.util.Hashtable;

import org.comstudy21.phonebook.model.PhoneBookDao;
import org.comstudy21.phonebook.model.PhoneBookDto;
import org.comstudy21.phonebook.view.Delete;
import org.comstudy21.phonebook.view.End;
import org.comstudy21.phonebook.view.Input;
import org.comstudy21.phonebook.view.Menu;
import org.comstudy21.phonebook.view.Modify;
import org.comstudy21.phonebook.view.Output;
import org.comstudy21.phonebook.view.PhoneBookView;
import org.comstudy21.phonebook.view.Search;

public interface R {
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6; // 컨트롤러가 활용할 숫자. 무엇을 선택하면 무엇으로
																						// 들어갈지.

	Hashtable<String, Object> request = new Hashtable<String, Object>(); // Object는 모든지 다 담을 수 있다. key를 dto no값이 중복될 경우
																			// 벨류값을 덮어쓴다. //인터페이스는 기본적으로 스테틱 파이널로 선언됨
																			// 안쓰면 알아서 입력된다.

	// 배열로 생성자 완성.
	PhoneBookView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(),	new Delete(), new End()};
	
	
	ArrayList<PhoneBookDto> dtoList = new ArrayList<PhoneBookDto>();
	PhoneBookDao dao = new PhoneBookDao(dtoList); //  인자가 없는 생성자는 없어야한다.??
}

