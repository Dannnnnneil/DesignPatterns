package com.dp.factorymethod;

/**
 * ��������ģʽ������Ĺ�����Ϊʵ��ͬһ�ӿڵ����ṩͳһ�Ĵ���������ʹ���ʵ�����ӳٵ�������С�
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneFactory factory = new MiPhoneFactory();
		Phone phone = factory.newPhone();
		phone.call();
	}

}
