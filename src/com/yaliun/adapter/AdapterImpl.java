package com.yaliun.adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		return (float)Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float haltOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float)Math.half(f.doubleValue());
	}

}
