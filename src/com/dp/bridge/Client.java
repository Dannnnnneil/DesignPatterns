package com.dp.bridge;

/**
 * �Ž�ģʽ�������󲿷���ʵ�ֲ��ַ��룬ʹ�����ʵ�־��ɶ����ı仯��
 * @author Leo
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message = new NormalMessage();
		message.from = "Leo";
		message.content = "I love you.";
		message.to = "Yan";
		message.send();
	}

}
