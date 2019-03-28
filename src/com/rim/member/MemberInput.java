package com.rim.member;

import java.util.Scanner;

public class MemberInput {

	public Member join() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		
		System.out.println("*********회원가입**********");
		System.out.println("ID:");
		member.setId(sc.next());
		System.out.println("PW:");
		member.setPw(sc.next());
		System.out.println("나이:");
		member.setAge(sc.nextInt());
		System.out.println("Email:");
		member.setEmail(sc.next());
		System.out.println("연락처:");
		member.setPhone(sc.next());
		
		return member;
	}
	
	
	public Member login(Member[] members) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		
		System.out.println("==========로그인==========");
		System.out.println("id입력: ");
		String id = sc.next();
		
		System.out.println("pw입력: ");
		String pw = sc.next();
		
		for(int i=0;i<members.length;i++) {
			if(id.equals(members[i].getId()) && pw.equals(members[i].getPw())) {
				System.out.println("로그인 성공!!");
				member = members[i];
				break;
			}
		}
		
		return member;
	}
}
