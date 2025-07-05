package com.atguigu.factory.absfactory.pizzastore.order;

/**
 * @author 34655
 */
public class PizzaStore {

	public static void main(String[] args) {
		// new OrderPizza(new BJFactory());
		new OrderPizza(new LondonFactory());
	}

}
