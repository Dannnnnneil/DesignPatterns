package com.dp.singleton;

/**
 * ����ģʽ��ȷ��ϵͳ��ֻ�����һ��ʵ����
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstance().text = "����ģʽ";
		Singleton.getInstance().show();
	}

}