package com.yaliun.strategy;

public class Sword implements Weapon {

	@Override
	public void doAttack() {
		System.out.println("검 공격");
	}

}
