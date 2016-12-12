package com.dp.mediator;

/**
 * �н���ģʽ����һ���н��߶�������װһϵ�еĶ��󽻻����н���ʹ�ø�����֮�䲻��Ҫ��ʾ���໥���ã��Ӷ�ʹ����ɢ��ϣ����ҿ��Զ����ĸı�����֮��Ľ�����
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new ConcreteMediator();
		Buyer buyer = new Buyer("Leo", mediator);
		Seller seller = new Seller("Yan", mediator);
		seller.sell("���з��ӳ���");
		buyer.buy("��Ҫ�ⷿ�ӣ�һ����");
	}

}
