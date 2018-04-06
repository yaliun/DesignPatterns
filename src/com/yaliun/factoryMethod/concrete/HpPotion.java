package com.yaliun.factoryMethod.concrete;

import com.yaliun.factoryMethod.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복!");
	}

}
