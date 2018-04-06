package com.yaliun.factoryMethod.concrete;

import java.util.Date;

import com.yaliun.factoryMethod.framework.Item;
import com.yaliun.factoryMethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 체력 회복 물약 정보 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 물약을 새로 생성 했습니다."+ new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();		
	}

}
