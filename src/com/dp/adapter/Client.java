package com.dp.adapter;

/**
 * ������ģʽ����һ������ת���ɿͻ���Ҫ�Ľӿڣ��������ڽӿڲ�ͬ���µ���ļ��������⡣
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		USB usb = new ClassAdapter();
		usb.chargeTypeC();
		usb.chargeUSB();
	}
}
