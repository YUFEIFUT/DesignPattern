package com.atguigu.decorator;

/**
 * @author 34655
 */
public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDes(" ţ�� ");
		setPrice(2.0f); 
	}

}
