package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层(接口)
 * @author 34655
 */
public interface AbsFactory {
	/**
	 * 让下面的工厂子类来 具体实现
	 * @param orderType 订单类型
	 * @return 披萨实例
	 */
	Pizza createPizza(String orderType);
}
