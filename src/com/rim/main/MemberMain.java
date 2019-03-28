package com.rim.main;

import com.rim.member.Member;
import com.rim.member.MemberController;
import com.rim.member.MemberInput;
import com.rim.view.MemberView;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberController mc = new MemberController();
		MemberInput mi=new MemberInput();
		MemberView mv = new MemberView();
	
		mc.start();


	}

}
