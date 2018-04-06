package com.yaliun.factoryMethod;

import com.yaliun.factoryMethod.concrete.HpCreator;
import com.yaliun.factoryMethod.concrete.MpCreator;
import com.yaliun.factoryMethod.framework.Item;
import com.yaliun.factoryMethod.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();

		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
