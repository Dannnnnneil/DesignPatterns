package com.dp.observer;

/**
 * �۲���ģʽ����һ��һ�Զ�Ĺ�ϵ������������ͬһ�����󣬵��������߷����仯ʱ��ʹ�ü����߿��Զ�̬�ĸı䡣
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable magazine = new Magazine();
		
		Observer leo = new User();
		magazine.subscribe(leo);
		
		Observer yan = new User();
		magazine.subscribe(yan);
	
		magazine.notify("��������");
	}

}
