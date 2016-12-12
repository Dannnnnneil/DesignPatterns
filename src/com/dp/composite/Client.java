package com.dp.composite;

/**
 * ���ģʽ���Ѷ�����ϳ����νṹ�Ա�ʾ���ֺ�����Ĳ㼶�ṹ��
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company root = new BranchCompany("��������");
		
		Company alibaba = new BranchCompany("����Ͱ�");
		Company aHR = new LeafCompany("�������²�");
		Company aFinacial = new LeafCompany("�������");
		alibaba.add(aHR);
		alibaba.add(aFinacial);
		
		Company tecent = new BranchCompany("��Ѷ");
		Company tHR = new LeafCompany("��Ѷ���²�");
		Company tFinacial = new LeafCompany("��Ѷ����");
		tecent.add(tHR);
		tecent.add(tFinacial);
		
		root.add(alibaba);
		root.add(tecent);
		
		root.display(1);
	}

}
