package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhoneBookDao {
	private ArrayList<PhoneBookDto> dtoList; // 
	private int seq = 1;  // seq와 10~12열 삭제하면 인풋값만 사용.
	public PhoneBookDao(ArrayList<PhoneBookDto> dtoList) {
		this.dtoList = dtoList;
		this.dtoList.add(new PhoneBookDto(seq++, "kim", "010-2353-2820", "kim@naver.com"));
		this.dtoList.add(new PhoneBookDto(seq++, "lee", "010-2353-2340", "lee@naver.com"));
		this.dtoList.add(new PhoneBookDto(seq++, "park", "010-2353-2720", "park@naver.com"));
	}
	//dao를 만들때 컨트롤러 쪽에서 리소스에 dao가 선언되어 있고 그안에 dtoList가 들어 가 있음.
	


	public void insert(PhoneBookDto dto) {
//		System.out.println(">>> DAO");
		System.out.println(dto);
		dtoList.add(dto);
	}
// 다 담기.	
	public ArrayList<PhoneBookDto> selectAll(){ // 전체 데이터를 넘기는 selectAll
		//데이터를 담아서 넘김
		ArrayList<PhoneBookDto> list = new ArrayList<PhoneBookDto>(); // 인풋에서 폰북 dto 형 값을 리스트에 담아 
		for(int i =0; i< dtoList.size();i++) {
			//원본과 끊어줘야함 새로운 dto를 만들어 담는다.
			PhoneBookDto dto = dtoList.get(i); //새로운 곳에 옮긴다.
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			//
			PhoneBookDto newDto = new PhoneBookDto(idx, name, phone, email);
			list.add(newDto);
		}
		return list;
	}


// 골라 담기.
	public ArrayList<PhoneBookDto> select(PhoneBookDto originalDto) {
		ArrayList<PhoneBookDto> list = new ArrayList<PhoneBookDto>();
		for(int i =0; i< dtoList.size();i++) {
			String sName = originalDto.getName();
			if(sName.contentEquals(dtoList.get(i).getName())) {				
				PhoneBookDto dto = dtoList.get(i); 
				int idx = dto.getIdx();
				String name = dto.getName();
				String phone = dto.getPhone();
				String email = dto.getEmail();
				PhoneBookDto newDto = new PhoneBookDto(idx, name, phone, email);
				list.add(newDto);
			}
		}
		return list;
	}



	public void update(PhoneBookDto dto) {
		//idx으로 검색해서 해당 요소와 바꾸는 것.
		//idx가 같은 요소를 dto로 교체한다.
		for(int i = 0; i < dtoList.size();i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.set(i, dto); //어레이리스트로 변경.
				return;
			}
		}
		
	}



	public void delete(PhoneBookDto dto) {
		for(int i = 0; i < dtoList.size();i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.remove(i); //어레이리스트의 remove 기능 이용.
				return;
			}
		}
	}
	
}

////싱글톤 - 어차피 기능만있기때문에 객체를 여러개를 만들 필요없다. 정의: 이 클래스에 객체는 오직 하나 뿐이다.
////싱글톤으로 만드는 조건 
////1. 생성자를 private으로 하면 외부에서 객체 생성이 불가.
//private PhoneBookDao() {
//	// TODO Auto-generated constructor stub
//}
//
////외부에서 접근할 수 있는 getinstance를 만든다. 외부에서 접근할 수 있도록
//
//private static PhoneBookDao instatnce = null;
//
//public static PhoneBookDao getInstance() {
//	if(instatnce == null) { // 없으면 폰북 디에이오를 만든다.
//		instatnce = new PhoneBookDao();
//	}
//	return instatnce;
//}
//
////사용자가 사용? 어렵넹~
//
//public void setDtoList(ArrayList<PhoneBookDto> dtoList) {
//	this.dtoList = dtoList;
//}
