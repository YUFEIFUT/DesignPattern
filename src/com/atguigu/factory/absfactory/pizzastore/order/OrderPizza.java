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
	 * ������
	 */
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}

	private void setFactory(AbsFactory factory) {
		Pizza pizza;
		// �û�����
		String orderType;
		this.factory = factory;
		do {
			orderType = getType();
			// factory �����Ǳ����Ĺ������࣬Ҳ�������׶صĹ�������
			pizza = factory.createPizza(orderType);
			// ����ok
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("����ʧ��");
				break;
			}
		} while (true);
	}

	/**
	 * дһ�����������Ի�ȡ�ͻ�ϣ����������������
	 */
	private String getType() {
		try {
			BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			return strIn.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
