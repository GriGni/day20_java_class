package org.comstudy21.phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhoneBookDto;
import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.view.Menu;

public class PhoneBookController implements R {
	private void outputCmd() { // 입력된 값을 목록으로 출력.
		ArrayList<PhoneBookDto> list = dao.selectAll(); // 밑으로 3줄이 목록보여주는 역할
		request.put("list", list);
		views[OUTPUT].show();
	}
	
	PhoneBookDto dto;
	
	
	public void service() { // 호출 기능 구현.
//		Menu menu = new Menu(); // 객체 생성.
//		menu.show();
//		System.out.println(request.get("no")); // requset 바인딩한게 컨트롤러에서 잘 돌아가는지 유효성검사.
//		switch(no) { //여기서 쓰일 객체를 리소스에 만든다.
//		case INPUT : System.out.println("입력"); break;// INPUT 객체 호출
//		case OUTPUT : System.out.println("출력"); break;// OUTPUT 객체 호출
//		case SEARCH : System.out.println("검색"); break;// SEARCH 객체 호출
//		case MODIFY : System.out.println("수정"); break;// MODIFY 객체 호출
//		case DELETE : System.out.println("삭제"); break;// DELETE 객체 호출
//		case END : System.out.println("종료"); break;// END 객체 호출
//		default : System.out.println("해당 사항 없습니다!");
//		}
		views[MENU].show();
		int no = (int) request.get("no"); // int로 형변환 하는 이유 request의 형이 다라서.

		switch (no) { // 여기서 쓰일 객체를 리소스에 만든다.
		case INPUT:
			views[INPUT].show();
			//입력이 끝나면 request에 정보가 있을 것이다.
			//출력이 되면 입력받은 정보를 dao로 넘겨준다.
//			System.out.println(request.get("dto")); // 유효성 검사
			//dao를 넘겨주는 것 선언해서 코딩함.
			dao.insert((PhoneBookDto)request.get("dto"));
			break;// INPUT 객체 호출 views로 연결 리소스의 것들.
		case OUTPUT:
			outputCmd();
			break;// OUTPUT 객체 호출
		case SEARCH:
			views[SEARCH].show();
			//request에서 dto를 가져온다.
			dto = (PhoneBookDto)request.get("dto");
//			System.out.println(dto);
//			System.out.println(request.get("dto"));//유효성 검사
			ArrayList<PhoneBookDto> searchList = dao.select(dto);
			request.put("list", searchList);
			views[OUTPUT].show();
			break;// SEARCH 객체 호출
		case MODIFY:
			outputCmd();
			views[MODIFY].show();
			//입력 받은 데이터 dao로 전달
			dto = (PhoneBookDto)request.get("dto"); //다운캐스팅
			dao.update(dto);
			break;// MODIFY 객체 호출
		case DELETE:
			outputCmd();
			views[DELETE].show();
			dto = (PhoneBookDto)request.get("dto");  //dto 입력
			dao.delete(dto);
			break;// DELETE 객체 호출
		case END:
			views[END].show();
			break;// END 객체 호출
		default:
			System.out.println("해당 사항 없습니다!");
		}
		// 재귀호출을 이용한 다시 호출
		service();

	}

}
