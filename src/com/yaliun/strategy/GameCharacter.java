package com.yaliun.strategy;

public class GameCharacter {
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void attack(){
		if(weapon == null){
			System.out.println("맨손 공격");
		}else{
			weapon.doAttack();
		}
	}
}
