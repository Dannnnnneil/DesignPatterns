package com.dp.command;

/**
 * ����ģʽ���������װ�ɶ����Ա�ʹ�ò�ͬ��������־�����е���������������������ģʽ֧�ֳ���������
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request request = new Request(new Command(new Receiver()));
		request.request();
	}

}
