package com.dp.decorator;

/**
 * װ����ģʽ����̬����ӹ��ܡ�
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes clothes = new Suit(new TShirt());
		clothes.wear();
	}

}
