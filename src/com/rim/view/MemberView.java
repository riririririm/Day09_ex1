package com.rim.view;

import com.rim.member.Member;

public class MemberView {
	//회원의 정보를 출력하는 메서드
	public void viewInfo(Member member) {
		System.out.println("회원 ID:"+ member.getId());
		System.out.println("나이:" + member.getAge());
		System.out.println("이메일:"+member.getEmail());
		System.out.println("연락처:"+member.getPhone());
		
	}
	
	//회원들의 정보를 출력하는 메서드
	public void viewInfo(Member[] members) {
		for(int i=0;i<members.length;i++) {
			System.out.println("회원 ID:"+ members[i].getId());
			System.out.println("나이:" + members[i].getAge());
			System.out.println("이메일:"+members[i].getEmail());
			System.out.println("연락처:"+members[i].getPhone());
			System.out.println();
		}
	}
	

	
}
