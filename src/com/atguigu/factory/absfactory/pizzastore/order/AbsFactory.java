package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * һ�����󹤳�ģʽ�ĳ����(�ӿ�)
 * @author 34655
 */
public interface AbsFactory {
	/**
	 * ������Ĺ��������� ����ʵ��
	 * @param orderType ��������
	 * @return ����ʵ��
	 */
	Pizza createPizza(String orderType);
}
