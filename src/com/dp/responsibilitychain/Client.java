package com.dp.responsibilitychain;

/**
 * ������ģʽ�����󱣳ֶ���һ����������ö����ӳ����������ڴ����Ͻ��д��ݣ�ֱ��ĳ�����������������󡣶��ڿͻ��˶��ԣ��䲢��֪���ĸ������������󡣿����ڲ�Ӱ��ͻ��˵�����¶�̬��������֯�ͷ�������ְ��
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		chain.addFilter(new HtmlFilter());
		chain.addFilter(new SensitiveFilter());
		Request request = new Request("<h1>Fuck the word</h1>");
		Response response = new Response();
		chain.doFilter(request, response, chain);
		System.out.println(response.text);
		System.out.println(request.text);
	}
}
