package com.dp.iterator;

/**
 * ������ģʽ���ṩһ�ַ���˳����ʾۺ϶����еĸ�Ԫ�أ����ֲ���¶�ö�����ڲ�ʵ�֡�
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringList names = new StringList();
		names.put("Leo");
		names.put("yan");
		names.put("Lily");
		Iterator iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
