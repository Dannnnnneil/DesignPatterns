package com.dp.prototype;

/**
 * ԭ��ģʽ��ͨ����¡Ϊһ��������һ��������
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Document document = new Document("I love you.");
		Document copy = (Document) document.clone();
		copy.show();
		copy.setText("I Love You.");
		document.show();
	}
}
