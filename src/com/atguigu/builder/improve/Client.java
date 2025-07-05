package com.atguigu.builder.improve;

/**
 * @author 34655
 */
public class Client {
	public static void main(String[] args) {
		
		//����ͨ����
		CommonHouse commonHouse = new CommonHouse();
		//׼���������ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//��ɸǷ��ӣ����ز�Ʒ(��ͨ����)
		House house1 = houseDirector.constructHouse();

		System.out.println(house1);
		//System.out.println("�������");
		
		System.out.println("--------------------------");
		//�Ǹ�¥
		HighBuilding highBuilding = new HighBuilding();
		//���ý�����
		houseDirector.setHouseBuilder(highBuilding);
		//��ɸǷ��ӣ����ز�Ʒ(��¥)
		House house2 = houseDirector.constructHouse();
		System.out.println(house2);

	}
}
