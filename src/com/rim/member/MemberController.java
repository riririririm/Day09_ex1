package com.rim.member;

import java.util.Scanner;

import com.rim.view.MemberView;

public class MemberController {
	private Scanner sc;
	private Member[] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;
	private Member m;
	
	public MemberController() {
		sc = new Scanner(System.in);
		members = new Member[0];//개체는 만들지만 칸은x
		mi = new MemberInput();
		ma = new MemberAdd();
		m = new Member();
		mv = new MemberView();
	}

	public void start() {
		// start
	// 1.회원가입 2.로그인 3.회원정보 전체출력 4.종료
		boolean check = true;
		
		
		while (check) {
			System.out.println("1.회원가입 / 2.로그인 / 3.회원정보 전체출력 / 4.종료");
			int select = this.sc.nextInt();

			switch (select) {
			case 1:
				Member m = mi.join();
				this.members = ma.add(members, m);
				break;
			case 2:
				mi.login(members);
				break;
			case 3:
				//System.out.println("------회원 전체 출력------");
				mv.viewInfo(members);
				break;
			case 4:
				System.out.println("프로그램 종료");
				check = !check;
				break;
			default:
				System.out.println("1~4중에 선택하세요");
			}//end of switch
			
		} // end of while
	}// end of start
}
