package com.yaliun.factoryMethod.concrete;

import com.yaliun.factoryMethod.framework.Item;

public class MpPotion implements Item{

	@Override
	public void use() {
		System.out.println("마력 회복!");
	}

}
