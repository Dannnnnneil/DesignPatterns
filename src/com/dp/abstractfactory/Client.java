package com.dp.abstractfactory;

/**
 * ���󹤳�ģʽ�������Ĺ�����Ϊһϵ�еĲ�Ʒ�ṩһ��ͳһ�Ĵ���������
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		Factory factory = new MiFactory();
		Phone phone = factory.newPhone();
		Computer computer = factory.newComputer();
		phone.call();
		computer.compute();
	}
}
