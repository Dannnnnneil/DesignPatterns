package com.dp.visitor;

/**
 * ������ģʽ����ʾһ��������ĳ����ṹ�и�Ԫ�صĲ�������ʹ���ڲ��ı��Ԫ�����ǰ���¶�����������ЩԪ�ص��²�����
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		ObjectStructure flowers = new ObjectStructure();
		flowers.attach(new Rose());
		flowers.attach(new Lily());
		flowers.accept(new Bee());
	}
}
