package com.atguigu.builder.improve;


/**
 * @author 34655
 * 抽象的建造者
 */
public abstract class HouseBuilder {

	protected House house = new House();

	/**
	 * 将建造的流程写好, 抽象的方法
	 */
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();

	/**
	 * 建造房子好， 将产品(房子) 返回
	 * @return 房子
	 */
	public House buildHouse() {
		return house;
	}
	
}
