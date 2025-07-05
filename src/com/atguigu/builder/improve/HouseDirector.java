package com.atguigu.builder.improve;

/**
 * @author 34655
 * ָ���ߣ�����ȥָ���������̣����ز�Ʒ
 */
public class HouseDirector {
	
	HouseBuilder houseBuilder;

	/**
	 * ���������� houseBuilder
	 * @param houseBuilder ������
	 */
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * ͨ��setter ���� houseBuilder
	 * @param houseBuilder ������
	 */
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * ��δ����췿�ӵ����̣�����ָ����
	 */
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}
