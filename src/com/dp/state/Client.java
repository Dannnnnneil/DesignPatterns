package com.dp.state;

/**
 * ״̬ģʽ��������������ڲ������ı�ʱ�ı�����Ϊ�����ڶ����ƺ��ı������ࡣ
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVController controller = new TVController();
		controller.nextChannel();
		controller.powerOn();
		controller.nextChannel();
	}

}
