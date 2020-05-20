package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhoneBookDao {
	private ArrayList<PhoneBookDto> dtoList; // 
	private int seq = 1;  // seq�� 10~12�� �����ϸ� ��ǲ���� ���.
	public PhoneBookDao(ArrayList<PhoneBookDto> dtoList) {
		this.dtoList = dtoList;
		this.dtoList.add(new PhoneBookDto(seq++, "kim", "010-2353-2820", "kim@naver.com"));
		this.dtoList.add(new PhoneBookDto(seq++, "lee", "010-2353-2340", "lee@naver.com"));
		this.dtoList.add(new PhoneBookDto(seq++, "park", "010-2353-2720", "park@naver.com"));
	}
	//dao�� ���鶧 ��Ʈ�ѷ� �ʿ��� ���ҽ��� dao�� ����Ǿ� �ְ� �׾ȿ� dtoList�� ��� �� ����.
	


	public void insert(PhoneBookDto dto) {
//		System.out.println(">>> DAO");
		System.out.println(dto);
		dtoList.add(dto);
	}
// �� ���.	
	public ArrayList<PhoneBookDto> selectAll(){ // ��ü �����͸� �ѱ�� selectAll
		//�����͸� ��Ƽ� �ѱ�
		ArrayList<PhoneBookDto> list = new ArrayList<PhoneBookDto>(); // ��ǲ���� ���� dto �� ���� ����Ʈ�� ��� 
		for(int i =0; i< dtoList.size();i++) {
			//������ ��������� ���ο� dto�� ����� ��´�.
			PhoneBookDto dto = dtoList.get(i); //���ο� ���� �ű��.
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


// ��� ���.
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
		//idx���� �˻��ؼ� �ش� ��ҿ� �ٲٴ� ��.
		//idx�� ���� ��Ҹ� dto�� ��ü�Ѵ�.
		for(int i = 0; i < dtoList.size();i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.set(i, dto); //��̸���Ʈ�� ����.
				return;
			}
		}
		
	}



	public void delete(PhoneBookDto dto) {
		for(int i = 0; i < dtoList.size();i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.remove(i); //��̸���Ʈ�� remove ��� �̿�.
				return;
			}
		}
	}
	
}

////�̱��� - ������ ��ɸ��ֱ⶧���� ��ü�� �������� ���� �ʿ����. ����: �� Ŭ������ ��ü�� ���� �ϳ� ���̴�.
////�̱������� ����� ���� 
////1. �����ڸ� private���� �ϸ� �ܺο��� ��ü ������ �Ұ�.
//private PhoneBookDao() {
//	// TODO Auto-generated constructor stub
//}
//
////�ܺο��� ������ �� �ִ� getinstance�� �����. �ܺο��� ������ �� �ֵ���
//
//private static PhoneBookDao instatnce = null;
//
//public static PhoneBookDao getInstance() {
//	if(instatnce == null) { // ������ ���� ���̿��� �����.
//		instatnce = new PhoneBookDao();
//	}
//	return instatnce;
//}
//
////����ڰ� ���? ��Ƴ�~
//
//public void setDtoList(ArrayList<PhoneBookDto> dtoList) {
//	this.dtoList = dtoList;
//}
