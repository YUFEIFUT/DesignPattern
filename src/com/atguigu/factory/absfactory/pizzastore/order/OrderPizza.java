package com.atguigu.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @author 34655
 */
public class OrderPizza {

	AbsFactory factory;

	/**
	 * 构造器
	 */
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}

	private void setFactory(AbsFactory factory) {
		Pizza pizza;
		// 用户输入
		String orderType;
		this.factory = factory;
		do {
			orderType = getType();
			// factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
			pizza = factory.createPizza(orderType);
			// 订购ok
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
				break;
			}
		} while (true);
	}

	/**
	 * 写一个方法，可以获取客户希望订购的披萨种类
	 */
	private String getType() {
		try {
			BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			return strIn.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
