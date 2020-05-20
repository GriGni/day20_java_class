package org.comstudy21.phonebook.view;

import java.util.Scanner;

import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.util.MyUtil;  // 부모클래스여서 유틸에 있는 기능을 가져오면 하위가 다 사용가능.

public abstract class PhoneBookView implements R { // 폰북 뷰의 최상위 부모 클래스
	
	protected static Scanner scan = MyUtil.scan; // 상속관계 내에서만 스캐너를 사용할 경우 부모가 유틸에 연결하면 다른 하위 클래스가 스캐너를 선언할 필요없이 바로 사용 가능.
	protected abstract void display();// 외부에서 접근 못함 프로텍티드로 연결. 상속받는 관계만 참조가능.  추상메소드를 하는 이유 추상메소드를 상속하여 각자 클래스가 자신에 맞게 구현.
	
	//2. 템플릿 메서드 
	public void show() { // 디스플레이 파트 
		System.out.println("------------------------------------------------------------");
		display();
	}
	
}
