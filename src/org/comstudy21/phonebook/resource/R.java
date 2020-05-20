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
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6; // ��Ʈ�ѷ��� Ȱ���� ����. ������ �����ϸ� ��������
																						// ����.

	Hashtable<String, Object> request = new Hashtable<String, Object>(); // Object�� ����� �� ���� �� �ִ�. key�� dto no���� �ߺ��� ���
																			// �������� �����. //�������̽��� �⺻������ ����ƽ ���̳η� �����
																			// �Ⱦ��� �˾Ƽ� �Էµȴ�.

	// �迭�� ������ �ϼ�.
	PhoneBookView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(),	new Delete(), new End()};
	
	
	ArrayList<PhoneBookDto> dtoList = new ArrayList<PhoneBookDto>();
	PhoneBookDao dao = new PhoneBookDao(dtoList); //  ���ڰ� ���� �����ڴ� ������Ѵ�.??
}

