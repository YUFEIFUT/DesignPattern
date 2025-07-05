package com.atguigu.singleton.type7;


/**
 * @author 34655
 */
public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		// true
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
		
	}

}

// ��̬�ڲ�����ɣ� �Ƽ�ʹ��
class Singleton {

	//������˽�л�
	private Singleton() {}
	
	//дһ����̬�ڲ���,��������һ����̬���� Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton(); 
	}
	
	//�ṩһ����̬�Ĺ��з�����ֱ�ӷ���SingletonInstance.INSTANCE
	
	public static synchronized Singleton getInstance() {
		//ִ��������仰��ʱ��̬�ڲ������װ��
		return SingletonInstance.INSTANCE;
	}
}