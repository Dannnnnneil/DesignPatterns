package com.dp.facade;

/**
 * ���ģʽ��Ϊ��ϵͳ��һϵ�нӿ��ṩһ��һ�µ���ۣ�����һ���߲�ӿڣ�����ӿ�ʹ����ϵͳ��������ʹ�á�
 * @author Leo
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.powerOn();
		computer.powerOff();
	}

}
