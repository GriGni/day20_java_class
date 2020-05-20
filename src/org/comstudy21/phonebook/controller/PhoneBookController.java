package org.comstudy21.phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhoneBookDto;
import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.view.Menu;

public class PhoneBookController implements R {
	private void outputCmd() { // �Էµ� ���� ������� ���.
		ArrayList<PhoneBookDto> list = dao.selectAll(); // ������ 3���� ��Ϻ����ִ� ����
		request.put("list", list);
		views[OUTPUT].show();
	}
	
	PhoneBookDto dto;
	
	
	public void service() { // ȣ�� ��� ����.
//		Menu menu = new Menu(); // ��ü ����.
//		menu.show();
//		System.out.println(request.get("no")); // requset ���ε��Ѱ� ��Ʈ�ѷ����� �� ���ư����� ��ȿ���˻�.
//		switch(no) { //���⼭ ���� ��ü�� ���ҽ��� �����.
//		case INPUT : System.out.println("�Է�"); break;// INPUT ��ü ȣ��
//		case OUTPUT : System.out.println("���"); break;// OUTPUT ��ü ȣ��
//		case SEARCH : System.out.println("�˻�"); break;// SEARCH ��ü ȣ��
//		case MODIFY : System.out.println("����"); break;// MODIFY ��ü ȣ��
//		case DELETE : System.out.println("����"); break;// DELETE ��ü ȣ��
//		case END : System.out.println("����"); break;// END ��ü ȣ��
//		default : System.out.println("�ش� ���� �����ϴ�!");
//		}
		views[MENU].show();
		int no = (int) request.get("no"); // int�� ����ȯ �ϴ� ���� request�� ���� �ٶ�.

		switch (no) { // ���⼭ ���� ��ü�� ���ҽ��� �����.
		case INPUT:
			views[INPUT].show();
			//�Է��� ������ request�� ������ ���� ���̴�.
			//����� �Ǹ� �Է¹��� ������ dao�� �Ѱ��ش�.
//			System.out.println(request.get("dto")); // ��ȿ�� �˻�
			//dao�� �Ѱ��ִ� �� �����ؼ� �ڵ���.
			dao.insert((PhoneBookDto)request.get("dto"));
			break;// INPUT ��ü ȣ�� views�� ���� ���ҽ��� �͵�.
		case OUTPUT:
			outputCmd();
			break;// OUTPUT ��ü ȣ��
		case SEARCH:
			views[SEARCH].show();
			//request���� dto�� �����´�.
			dto = (PhoneBookDto)request.get("dto");
//			System.out.println(dto);
//			System.out.println(request.get("dto"));//��ȿ�� �˻�
			ArrayList<PhoneBookDto> searchList = dao.select(dto);
			request.put("list", searchList);
			views[OUTPUT].show();
			break;// SEARCH ��ü ȣ��
		case MODIFY:
			outputCmd();
			views[MODIFY].show();
			//�Է� ���� ������ dao�� ����
			dto = (PhoneBookDto)request.get("dto"); //�ٿ�ĳ����
			dao.update(dto);
			break;// MODIFY ��ü ȣ��
		case DELETE:
			outputCmd();
			views[DELETE].show();
			dto = (PhoneBookDto)request.get("dto");  //dto �Է�
			dao.delete(dto);
			break;// DELETE ��ü ȣ��
		case END:
			views[END].show();
			break;// END ��ü ȣ��
		default:
			System.out.println("�ش� ���� �����ϴ�!");
		}
		// ���ȣ���� �̿��� �ٽ� ȣ��
		service();

	}

}
