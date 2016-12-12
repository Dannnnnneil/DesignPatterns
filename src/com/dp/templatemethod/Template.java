package com.dp.templatemethod;

public abstract class Template {
	public void show() {
		showTitle();
		showContent();
	}
	
	private void showTitle() {
		System.out.println("Leo��ģ��");
	}
	
	public abstract void showContent();
}
