package org.comstudy21.phonebook.app;

//import static org.comstudy21.phonebook.resource.R.*;

import org.comstudy21.phonebook.controller.PhoneBookController;
//import org.comstudy21.phonebook.view.Menu; // �޴� ����Ʈ �޴� ���� �����ö�.

public class AppMain {
	//�������� ���̰� ���յ��� �����.
	public static void main(String[] args) {
		PhoneBookController controller = new PhoneBookController();  // �ٷ� ���ο��� ������� ������ mvc ������ controller�� ���ľ��Ѵ�. ��� �������� �׸��� ����Ǹ� ���ο��� ��Ʈ�ѷ��� ����
		controller.service();
	}
}
