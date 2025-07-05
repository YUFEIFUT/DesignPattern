package com.atguigu.builder.improve;


/**
 * @author 34655
 * ����Ľ�����
 */
public abstract class HouseBuilder {

	protected House house = new House();

	/**
	 * �����������д��, ����ķ���
	 */
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();

	/**
	 * ���췿�Ӻã� ����Ʒ(����) ����
	 * @return ����
	 */
	public House buildHouse() {
		return house;
	}
	
}
