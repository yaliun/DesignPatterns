package com.yaliun.templateMethod.helper;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	public String requestConnection(String encodedInfo){
		
		String decodeInfo = doSecurity(encodedInfo);
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)){
			throw new Error("아이디&암호 불일치");
		}
		
		String userName = "koko";
		int i = authorization(userName);
		
		switch(i){
		case 0: //게임 매니저
			break;
		case 1: //유료 회원
			break;
		case 2: //무료 회원
			break;
		case 3: //권한없음
			break;
		default: //기타상황
			break;
		}
		
		return connection(decodeInfo);
	}
}
