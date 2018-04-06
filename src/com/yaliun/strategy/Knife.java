package com.yaliun.strategy;

public class Knife implements Weapon {

	@Override
	public void doAttack() {
		System.out.println("칼 공격");
	}

}
