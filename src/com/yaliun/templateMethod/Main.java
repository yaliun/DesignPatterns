package com.yaliun.templateMethod;

import com.yaliun.templateMethod.helper.AbstGameConnectHelper;
import com.yaliun.templateMethod.helper.DefaultGameConnectionHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}
