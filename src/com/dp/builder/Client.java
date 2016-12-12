package com.dp.builder;

/**
 * ������ģʽ����һ�����Ӷ���Ĺ������̺����ʾ���룬ʹ��ͬ���Ĺ������̿������ò�ͬ�ı�ʾ��
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		Programmer programmer = new Programmer.Builder()
				.name("Leo")
				.age(25)
				.motto("Victory loves preparation.")
				.build();
		programmer.show();
	}
}
