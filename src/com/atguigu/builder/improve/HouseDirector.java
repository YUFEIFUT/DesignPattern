package com.atguigu.builder.improve;

/**
 * @author 34655
 * 指挥者，这里去指定制作流程，返回产品
 */
public class HouseDirector {
	
	HouseBuilder houseBuilder;

	/**
	 * 构造器传入 houseBuilder
	 * @param houseBuilder 构建器
	 */
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * 通过setter 传入 houseBuilder
	 * @param houseBuilder 构建器
	 */
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	/**
	 * 如何处理建造房子的流程，交给指挥者
	 */
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}
